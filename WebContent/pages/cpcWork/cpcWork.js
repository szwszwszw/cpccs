$(document).ready(function(){
	$("#div1").hide(function(){
		$("#div1").show(1000);
	});
	$("#jingsai_detail").hover(function(){
		$("#jingsai_detail").animate({
		    height:'45%',
		    width:'45%',
		    left:'2%',
		    top:'2%'
	  });
	},
	function(){
		$("#jingsai_detail").animate({
		    height:'40%',
		    width:'40%',
		    left:'5%',
		    top:'5%'
	  });
	});
	$("#dati_detail").hover(function(){
		$("#dati_detail").animate({
		    height:'45%',
		    width:'45%',
		    left:'52%',
		    top:'2%'
	  });
	},
	function(){
		$("#dati_detail").animate({
		    height:'40%',
		    width:'40%',
		    left:'55%',
		    top:'5%'
	  });
	});
	$("#add_jingsai").hover(function(){
		$("#add_jingsai").animate({
		    height:'45%',
		    width:'45%',
		    left:'2%',
		    top:'52%'
	  });
	},
	function(){
		$("#add_jingsai").animate({
		    height:'40%',
		    width:'40%',
		    left:'5%',
		    top:'55%'
	  });
	});
	$("#add_tiku").hover(function(){
		$("#add_tiku").animate({
		    height:'45%',
		    width:'45%',
		    left:'52%',
		    top:'52%'
	  });
	},
	function(){
		$("#add_tiku").animate({
		    height:'40%',
		    width:'40%',
		    left:'55%',
		    top:'55%'
	  });
	});


})