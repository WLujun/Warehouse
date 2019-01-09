<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
  <head>
	<meta charset="utf-8">
    <title>图片上传</title>
    <meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="../layui/css/layui.css"  media="all">
    <script src="../layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../js/jquery-1.12.0.min.js"></script>
    <style>
		* {
			margin: 0;
			padding: 0;
		}
		.inputfile {
			position: absolute;
			clip: rect(0, 0, 0, 0);
		}
		.showimage {
			width: 190px;
			height: 190px;
			border: 1px solid #e6e6e6;
			margin: 0 auto;
			
		}	
		#preview1{
			background: url("../images/logo1.png")no-repeat;
			background-size: 100% auto;
			background-position: center;
		}
		#preview2{
			background: url("../images/logo2.png")no-repeat;
			background-size: 100% auto;
			background-position: center;
		}
		#preview3{
			background: url("../images/logo3.png")no-repeat;
			background-size: 100% auto;
			background-position: center;
		}
		#preview4{
			background: url("../images/logo4.png")no-repeat;
			background-size: 100% auto;
			background-position: center;
		}
		#preview5{
			background: url("../images/logo5.png")no-repeat;
			background-size: 100% auto;
			background-position: center;
		}
		#preview6{
			background: url("../images/logo6.png")no-repeat;
			background-size: 100% auto;
			background-position: center;
		}
		#preview8{
			background: url("../images/gfhdsc.png")no-repeat;
			background-size: 100% auto;
			background-position: center;
		}

	</style>
  </head>
  <body>
	<table cellspacing="0" cellpadding="0" border="0" class="layui-table"> 
		<thead>
			<tr>
				<th>
					<input type="file" accept="image/*" autocomplete="off" name="file1" id="file1" class="inputfile" onchange="preview(this)" showurl="preview1"/> 
					<label for="file1" class='layui-btn'>点击选择-图1</label>		
				</th>
				<th>
					<input type="file" accept="image/*" autocomplete="off" name="file2" id="file2" class="inputfile" onchange="preview(this)" showurl="preview2"/> 
					<label for="file2" class='layui-btn'>点击选择-图2</label>		
				</th>
				<th>
					<input type="file" accept="image/*" autocomplete="off" name="file3" id="file3" class="inputfile" onchange="preview(this)" showurl="preview3"/> 
					<label for="file3" class='layui-btn'>点击选择-图3</label>		
				</th>
				<th>
					<input type="file" accept="image/*" autocomplete="off" name="file4" id="file4" class="inputfile" onchange="preview(this)" showurl="preview4"/> 
					<label for="file4" class='layui-btn'>点击选择-图4</label>		
				</th>
				<th>
					<input type="file" accept="image/*" autocomplete="off" name="file5" id="file5" class="inputfile" onchange="preview(this)" showurl="preview5"/> 
					<label for="file5" class='layui-btn'>点击选择-图5</label>		
				</th>
				<th>
					<input type="file" accept="image/*" autocomplete="off" name="file6" id="file6" class="inputfile" onchange="preview(this)" showurl="preview6"/> 
					<label for="file6" class='layui-btn'>点击选择-图6</label>		
				</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>
					<div class="showimage" id="preview1"></div>
				</td>
				<td>
					<div class="showimage" id="preview2"></div>
				</td>
				<td>
					<div class="showimage" id="preview3"></div>
				</td>
				<td>
					<div class="showimage" id="preview4"></div>
				</td>
				<td>
					<div class="showimage" id="preview5"></div>
				</td>
				<td>
					<div class="showimage" id="preview6"></div>
				</td>
			</tr>
			<tr>
				<td>
					<input type="file" accept="image/*" autocomplete="off" name="file7" id="file7" class="inputfile" onchange="preview(this)" showurl="preview7"/> 
					<label for="file7" class='layui-btn'>发行方概念图-图7</label>		
				</td>
				<td>
					<input type="file" accept="image/*" autocomplete="off" name="file8" id="file8" class="inputfile" onchange="preview(this)" showurl="preview8"/> 
					<label for="file8" class='layui-btn'>官方活动素材-图8</label>		
				</td>
				<td>
					<input type="file" accept="image/*" autocomplete="off" name="file9" id="file9" class="inputfile" onchange="preview(this)" showurl="preview9"/> 
					<label for="file9" class='layui-btn layui-btn-disabled'>备用类型-图9</label>		
				</td>
				<td>
					<input type="file" accept="image/*" autocomplete="off" name="file10" id="file10" class="inputfile" onchange="preview(this)" showurl="preview10"/> 
					<label for="file10" class='layui-btn layui-btn-disabled'>备用类型-图10</label>		
				</td>
				<td>
					<input type="file" accept="image/*" autocomplete="off" name="file11" id="file11" class="inputfile" onchange="preview(this)" showurl="preview11"/> 
					<label for="file11" class='layui-btn layui-btn-disabled'>备用类型-图11</label>		
				</td>
				<td>
					<input type="file" accept="image/*" autocomplete="off" name="file12" id="file12" class="inputfile" onchange="preview(this)" showurl="preview12"/> 
					<label for="file12" class='layui-btn layui-btn-disabled'>备用类型-图12</label>		
				</td>
			</tr>
			<tr>
				<td>
					<div class="showimage" id="preview7"></div>
				</td>
				<td>
					<div class="showimage" id="preview8"></div>
				</td>
				<td>
					<div class="showimage" id="preview9"></div>
				</td>
				<td>
					<div class="showimage" id="preview10"></div>
				</td>
				<td>
					<div class="showimage" id="preview11"></div>
				</td>
				<td>
					<div class="showimage" id="preview12"></div>
				</td>
			</tr>
			<tr>
				<td colspan="6">
					<div class="layui-progress layui-progress-big" lay-filter="demo" lay-showPercent="yes">
						<div class="layui-progress-bar layui-bg-green" lay-percent="100%"></div>
					</div>
				</td>
			</tr>
			<tr>
				<td colspan="6" style="text-align: center;">
					（注意：上传前先核对sku和id是否存在及正确，当前id：${model.pid}，当前sku:<font color='red'>${model.sku}</font>）
					<button class="layui-btn layui-btn-normal" id="upload">确认上传</button>
				</td>
			</tr>
		</tbody>
	</table>
	
    <script type="text/javascript">
    
    /**
     * 本地预览图片 并验证部分图片像素
     */
    function preview(file){
    	if (file.files && file.files[0]){
    		verificationPicFile(file);//验证大小
	    	var reader = new FileReader(); 
	    	reader.onload = function(evt){ 
	    		var array = ['file1','file2','file3','file4','file5'],
	    		fileID = file.attributes["id"].value,
	    		show = file.attributes["showurl"].value,
	            base64 = evt.target.result;
	    		if($.inArray(fileID,array) != -1){
	    			var image = new Image();
					image.onload = function(){
					    var width = image.width;
					    var height = image.height;
					    if(width==1200 && height==1200){
					  	  $("#"+show).html("<img style='max-width:100%;height:auto;' src='"+base64+"'/>");
					    }else{
					      getPopup("图片像素不符合1200*1200尺寸",7);
					  	  file.value = null;
					  	  return false;
					    }
					};
					image.src= base64;
	    		}else{
	    			$("#"+show).html("<img style='max-width:100%;height:auto;' src='"+base64+"'/>");
	    		}	
	    	} 
	    	reader.readAsDataURL(file.files[0]); 
    	}
    }
    
    /**
     * 校验上传文件大小  大于0M小于3M
   	 */
    function verificationPicFile(file) {
        var fileSize = 0;
        var fileMaxSize = 1024*3;//3M
        var filePath = file.value;
        if(filePath){
            fileSize =file.files[0].size;
            var size = fileSize / 1024;
            if (size > fileMaxSize) {
            	getPopup("文件大小不能大于3M！",7);
                file.value = null;
                return false;
            }else if (size <= 0) {
            	getPopup("文件大小必须大于0M！",7);
                file.value = null;
                return false;
            }
        }else{
            return false;
        }
    }
    
    /**
     * 轮询上传进度
     */
    function showStatus() {
		var intervalId = setInterval(function() {
			$.get("${pageContext.request.contextPath}/fileUpload/getStatus.php", {}, function(data, status) {
				console.log(data);
				var percent = data.percent;
				if (percent >= 100) {
					clearInterval(intervalId);
					percent = 100;//不能大于100
				}
				layui.use('element', function(){//进度条
			    	  var element = layui.element;
			    	  element.progress('demo', percent+'%');
			    });
			}, "json");
		}, 100);
	}

    var clicks = true;//防止重复点击
    /**
     * 点击按钮上传
   	 */
    $("#upload").click(function () {
    	if(clicks){
	    	var formData = new FormData();
	    	var temp = 0;
		    formData.append("pid",'${model.pid}');
		    formData.append("sku",${model.sku});
		    for (var i = 1; i < 13; i++) {//总共12个类型
		    	if($('#file'+i)[0].files[0] != null){
			    	formData.append(i,$('#file'+i)[0].files[0]);//i是文件名字 后台作为类型判断依据
			    	temp++;
			    }
			}
		    if(temp > 0){//开始上传
		    	clicks = false;
		    	showStatus();//展示进度
		    	ajaxtSubmit(formData);//提交表单
		    }else{
		    	getPopup("没有选择任何文件",0);
		    }
    	}else{
    		console.warn('请勿重复点击');
    	}
    });
    
    /**
     * ajax提交上传表单
     */
    function ajaxtSubmit(formData) {
    	$.ajax({  
	         url: '${pageContext.request.contextPath}/fileUpload/springUpload.php',  
	         type: 'post',  
	         data: formData,  
	         cache: false,
	         processData: false,
	         contentType: false,
	         async: true
	    }).done(function(resText) {
	    	if(resText=='success'){
	    		alertMsg('全部上传成功',1);
	    	}else if(resText=='exception'){
	    		getPopup('系统内部出现异常',2);
	    		clicks = true;
	    	}else{
	    		getPopup('未知异常',5);
	    		clicks = true;
	    	}
	    }).fail(function(res) {
	    	getPopup("请求错误,上传失败！",5);
	    	clicks = true;
	    });
	}
    
    /**
     * layui弹出框 1 刷新后关闭页面
     */
 	function alertMsg(msg,ic) {
         layui.use('layer', function(){ //独立版的layer无需执行这一句
 			var $ = layui.jquery, layer = layui.layer; 
 	        layer.alert(msg, {
 	            icon: ic,
 	            skin: 'layer-ext-moon' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
 	        },
 	       	function () {//点击确认后刷新并关闭
                window.location.reload();
                window.close();
            });
         });
     }
    
 	/**
     * layui弹出框 2 不刷新不关闭
     */
 	function getPopup(msg,ic) {
         layui.use('layer', function(){
 			var $ = layui.jquery, layer = layui.layer; 
 	        layer.alert(msg, {
 	            icon: ic,
 	            skin: 'layer-ext-moon'
 	        });
         });
     }
    </script>
  </body>
</html>

 