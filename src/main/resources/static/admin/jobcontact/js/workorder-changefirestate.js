

function alreadywork(id) {
    var dataFormJson = {'orderId':id}
	$.ajax({
		cache : true,
		type : "POST",
		url : rootPath + "/OperatorController/alreadywork",
		data : dataFormJson,
		async : false,
		error : function(request) {
			$.modal.alertError("系统错误");
		},
		success : function(data) {
			$.operate.saveSuccess(data);
		}
	});
}