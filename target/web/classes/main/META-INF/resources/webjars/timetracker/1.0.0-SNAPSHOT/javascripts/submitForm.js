/**
 * Created by Bruno on 19/06/17.
 */
function submitForm() {
    $.ajax({
        url: jQuery("#form_Projeto").attr("action"),
        type: jQuery("#form_Projeto").attr("method"),
        data: jQuery("#form_Projeto").serialize(),
        statusCode: {
            201: (function () {
                alert("Record was created, you can close the modal");
            }),
            400: (function () {
                alert("hmmm badRequest...");
            })
        }
    });
}

$("#modalProjeto").on("hidden.bs.modal", function () {
    var new_val = $('#novovalor').val();
    $('#projeto_id').append('<option selected>' + new_val + '</option>');
    $('#opt-remove').remove();
});
""

var myOptions = {
    val1: 'text1',
    val2: 'text2'
};
var mySelect = $('#mySelect');
$.each(myOptions, function (val, text) {
    mySelect.append(
        $('<option></option>').val(val).html(text)
    );
});
