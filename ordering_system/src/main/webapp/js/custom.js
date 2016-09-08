//图片预览
function onPreviewLoad(sender, size){
	autoSizePreview( sender, sender.offsetWidth, sender.offsetHeight ,size , size);  
}   

//自动调整预览大小
function autoSizePreview( objPre, originalWidth, originalHeight , maxWidth, maxHeight ){ 
	var zoomParam = imgZoomParam( maxWidth, maxHeight, originalWidth, originalHeight );           	   
	objPre.style.width = zoomParam.width + "px";            	   
	objPre.style.height = zoomParam.height + "px";	
}      

//图像按比例缩小
function imgZoomParam( maxWidth, maxHeight, width, height ){            	   
	var param = { width:width, height:height };           	   
	if( width > maxWidth || height > maxHeight ){            		   
		rateWidth = width / maxWidth;            		  
		rateHeight = height / maxHeight;             		   
		if( rateWidth > rateHeight ){             			  
			param.width =  maxWidth;             			              			   
			param.height = height / rateWidth;
		}           	
		else{ 
			param.width = width / rateHeight;            			   
			param.height = maxHeight;              			   
		}
	}
	if( width < maxWidth && height < maxHeight ){            		   
		rateWidth = maxWidth / width ;            		  
		rateHeight = maxHeight / height ;             		   
		if( rateWidth > rateHeight ){             			  
			param.width =  width * rateHeight;             			              			   
			param.height = maxHeight;
		}           	
		else{ 
			param.width = maxWidth ;            			   
			param.height = height * rateHeight ;              			   
		}
	}
	return param;
} 
   
//日期选择器
$('.form_date').datetimepicker({
	language:  'zh-CN',
	weekStart: 1,
	todayBtn:  1,
	autoclose: 1,
	todayHighlight: 1,
	startView: 2,
	minView: 2,
	forceParse: 0,
	format: 'yyyy-mm-dd'
});


$(function(){
	$('.add-new').toggle();
});

$('#add').click(function(){
    //var $target = $(this).parent().next('.add-new');
    $('.add-new').slideToggle();
});

         
       