'use strict'
var validate = require('aproba')
var childPath = require('../utils/child-path.js')
var reset = require('./node.js').reset

module.exports = function inflateBundled(parent, children) {
    validate('OA', arguments)
    children.forEach(function (child) {
        reset(child)
        child.fromBundle = true
        child.parent = parent
        child.path = childPath(parent.path, child)
        child.realpath = childPath(parent.path, child)
        child.isLink = child.isLink || parent.isLink || parent.target
        inflateBundled(child, child.children)
    })
}
