$(document).ready(function(){
	$("#add_news").hide();
	$("#edit_news").hide();
	//鼠标移动悬停事件
	$("#news_div").hover(function(){
		$("#add_news").show(500);
		$("#edit_news").show(1000);
		$("#add_news").hover(function(){
			$("#add_news").css("background-color","#C75D4E");
		},
		function(){
			$("#add_news").css("background-color","#F7BD10");
		});
		$("#edit_news").hover(function(){
			$("#edit_news").css("background-color","#C75D4E");
		},
		function(){
			$("#edit_news").css("background-color","#F7BD10");
		});
	},
	function(){
		$("#add_news").hide(1000);
		$("#edit_news").hide(500);
	});
})




		