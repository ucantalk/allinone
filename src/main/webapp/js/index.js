$(function() {
	setIntervalFunction = setInterval("coolDown.countDown", 1000);
	$("body").click(function() {
		coolDown.time = 30;
	});

	$("#i_uName input").click(function() {
		$("#i_pWord input").removeAttr("id");
		$(this).val('');
		$(this).attr("id", "writing");
	});
	$("#i_pWord input").click(function() {
		$("#i_uName input").removeAttr("id");
		$(this).val('');
		$(this).attr("id", "writing");
	});
	$('#submit')
			.click(
					function() {
						if ($("#i_uName input").val() == '') {
							$().toastmessage('showWarningToast', "请输入学号");
							return false;
						}

						if ($("#i_pWord input").val() == '') {
							$().toastmessage('showWarningToast', "请输入密码");
							return false;
						}
						$(this)
								.attr("disabled", "true")
								.html(
										"<big>&nbsp;&nbsp;&nbsp;&nbsp;登陆中&nbsp;&nbsp;&nbsp;&nbsp;</big>");
						$
								.ajax({
									url : "login/checkUser",
									timeout : 10000,
									dataType : "json",
									async : true,
									data : {
										"userName" : $("#i_uName input").val(),
										"passWord" : $("#i_pWord input").val(),
									},
									type : "post",
									success : function(response) {
										$("#submit")
												.removeAttr("disabled")
												.html(
														"<big>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;登陆&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</big>");
										if (response == "200") {
											$("form").submit();
										} else if (response == "500") {
											$().toastmessage('showErrorToast',
													"查询数据出错");
										} else {
											$().toastmessage('showErrorToast',
													"错误的用户名或者密码");
										}
									},
									complete : function(XMLHttpRequest, status) { // 请求完成后最终执行参数
										if (status == 'timeout') { // 超时,status还有success,error等值的情况
											$("#submit")
													.removeAttr("disabled")
													.html(
															"<big>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;登陆&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</big>");
											$().toastmessage('showErrorToast',
													"无法连接服务器，请稍后再试");

										}
									}
								});

					});

	$('#keybord_panel li').click(
			function() {
				var $write = $("#writing");

				var $this = $(this), character = $this.html();
				// Shift keys
				if ($this.hasClass('left-shift')
						|| $this.hasClass('right-shift')) {
					$('.letter').toggleClass('uppercase');
					$('.symbol span').toggle();
					shift = (shift === true) ? false : true;
					capslock = false;
					return false;
				}

				// Caps lock
				if ($this.hasClass('capslock')) {
					$('.letter').toggleClass('uppercase');
					capslock = true;
					return false;
				}

				// Delete
				if ($this.hasClass('delete')) {
					var html = $write.val();

					$write.val(html.substr(0, html.length - 1));
					return false;
				}

				// Special characters
				if ($this.hasClass('symbol'))
					character = $('span:visible', $this).html();
				if ($this.hasClass('space'))
					character = ' ';
				if ($this.hasClass('tab'))
					character = "\t";
				if ($this.hasClass('return'))
					character = "\n";

				if ($this.hasClass('uppercase'))
					character = character.toUpperCase();

				if (shift === true) {
					$('.symbol span').toggle();
					if (capslock === false)
						$('.letter').toggleClass('uppercase');

					shift = false;
				}

				$write.val($write.val()
						+ character.replace("&amp;", "&").replace("&lt;", "<")
								.replace("&gt;", ">"));
			});

})

var shift = false, capslock = false, coolDown = {
	time : 30,
	countDown : function() {
		if (this.time > 0) {
			this.time--;
			$("li:eq(2) h3").html("&nbsp;&nbsp;[" + time + "]");

		} else {
			this.time = 30;
			setTimeout("coolDown.exit", 1000);
		}
	},
	exit : function() {
		panel.close();
	}
};
var panel = {
	show : function() {
		document.getElementsByTagName("input").value = "";
		document.getElementsByTagName("input")[0].setAttribute("id", "writing");
		documnet.getElementsByClassName("b-panel").style.display = "block";
	},
	close : function() {
		documnet.getElementsByClassName("b-panel").style.display = "none";
	}

}

// var openPanel = function() {
// $("input").val("");
// $("#i_uName input").attr("id", "writing");
// $(".b-panel").show();
// }
//
// var closePanel = function() {
// $(".b-panel").hide();
// }
