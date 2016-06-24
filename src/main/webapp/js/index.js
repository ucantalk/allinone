var coolDownTime = 30;// 倒计时时间
var shift = false, capslock = false;
var coolDown = {
	autoTime : function() {
		// 倒计时的方法
		if (coolDownTime > 0) {
			coolDownTime--;
			$("#cooldown").html("\u300c" + coolDownTime + "\u300d");

		} else {
			setTimeout("coolDown.returnLoginPage()", 1000);
		}
	},
	returnLoginPage : function() {
		// 关闭按钮的方法
		$(".b-panle").hide();
	}
};

// 连接输入框与键盘
$(function() {
	setIntervalFunction = setInterval("coolDown.autoTime()", 1000);
	$("body").click(function() {
		coolDownTime = 30;
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
	// 账号不能为空
	$('#dl').click(function() {
		if ($("#i_uName input").val() == '') {
			$().toastmessage('showWarningToast', "对不起，账号不可以为空！");
			return false;
		}
		;
		// 密码不能为空
		if ($("#i_pWord input").val() == '') {

			$().toastmessage('showWarningToast', "对不起，密码不可以为空！");
			return false;
		}
		;

		$.ajax({
			url : "login/checkUser.action",
			dataType : "json",
			async : true,
			data : {
				"userName" : $("#i_uName input").val(),
				"passWord" : $("#i_pWord input").val(),
			},
			type : "post",
			success : function(response) {
				if (response == "201") {
					alert("登陆成功");
				} else {
					alert("错误的用户名或者密码");
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

				// Uppercase letter
				if ($this.hasClass('uppercase'))
					character = character.toUpperCase();

				// Remove shift once a key is clicked.
				if (shift === true) {
					$('.symbol span').toggle();
					if (capslock === false)
						$('.letter').toggleClass('uppercase');

					shift = false;
				}

				// Add the character
				$write.val($write.val()
						+ character.replace("&amp;", "&").replace("&lt;", "<")
								.replace("&gt;", ">"));
			});

})

// 显示灰色 jQuery 遮罩层
function openPanel() {
	coolDownTime = 30;
	$(".b-panel").show();
}
// 关闭灰色 jQuery 遮罩
function closePanel() {
	$(".b-panel").hide();
}