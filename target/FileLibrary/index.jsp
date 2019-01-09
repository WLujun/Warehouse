<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>搜索页</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
    <script src="layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="js/jquery-1.12.0.min.js"></script>
</head>
<body>
<div  style="text-align:center;line-height: 60px;">
<form class="layui-form" action="#" lay-filter="example" id="search_list">
<div>
  <div class="layui-input-inline" style="width:100px;">
      <select name="state">
        <option value="">状态</option>
        <option value="现货">现货</option>
        <!-- <option value="宁波">在途</option>
        <option value="温州">预售</option>
        <option value="温州">订货</option> -->
      </select>
    </div>
    <div class="layui-input-inline" style="width:100px;">
      <select name="type">
        <option value="">版本</option>
        <option value="国产">国产</option>
        <option value="进口">进口</option>
      </select>
    </div>
    <div class="layui-input-inline" style="width:100px;">
      <select name="dielectric">
        <option value="">介质</option>
        <option value="蓝光BD">蓝光BD</option>
        <option value="4KUHD">4KUHD</option>
        <option value="DVD">DVD</option>
        <option value="VCD">VCD</option>
        <option value="CD">CD</option>
        <option value="LP">LP</option>
        <option value="影碟机">影碟机</option>
        <option value="包装耗材">包装耗材</option>
        <option value="线材">线材</option>
        <option value="图书">图书</option>
        <option value="电影周边">卡带</option>
        <option value="电影周边">机顶盒</option>
        <option value="电影周边">裸碟</option>
      </select>
    </div>
    <div class="layui-input-inline" style="width:100px;">
      <select name="spacking">
        <option value="">包装</option>
        <option value="胶盒">胶盒</option>
        <option value="纸盒">纸盒</option>
        <option value="SteelBook铁盒">SteelBook铁盒</option>
        <option value="铁盒">铁盒</option>
        <option value="裸碟">裸碟</option>
        <option value="书册">书册</option>
        <option value="特殊包装">特殊包装</option>
      </select>
    </div>
    <div class="layui-input-inline" style="width:100px;">
      <select name="subtitle">
        <option value="">字幕</option>
        <option value="中文">中文</option>
        <option value="简体中文">简体中文</option>
        <option value="繁体中文">繁体中文</option>
        <option value="英文">英文</option>
        <option value="日文">日文</option>
        <option value="德文">德文</option>
        <option value="法文">法文</option>
        <option value="韩文">韩文</option>
        <option value="俄文">俄文</option>
      </select>
    </div>
    <div class="layui-input-inline" style="width:100px;">
      <select name="dialogue">
        <option value="">对白</option>
	    <option value="英语">英语</option>
	    <option value="日语">日语</option>
	    <option value="国语">国语</option>
	    <option value="粤语">粤语</option>
	    <option value="韩语">韩语</option>
	    <option value="西班牙语">西班牙语</option>
	    <option value="印度语">印度语</option>
	    <option value="闽南语">闽南语</option>
	    <option value="无对白">无对白</option>
	    <option value="普通话">普通话</option>
	    <option value="法语">法语</option>
	    <option value="德国">德国</option>
	</select>
    </div>
    <div class="layui-input-inline" style="width:100px;">
      <select name="audio">
        <option value="">声道</option>
	    <option value="1.0声道">1.0声道</option>
	    <option value="2.0声道">2.0声道</option>
	    <option value="2.1声道">2.1声道</option>
	    <option value="4.0声道">4.0声道</option>
	    <option value="5.1声道">5.1声道</option>
	    <option value="6.0声道">6.0声道</option>
	    <option value="6.1声道">6.1声道</option>
	    <option value="7.1声道">7.1声道</option>
	    <option value="DTS:X">DTS:X</option>
	    <option value="杜比全景声Atmos">杜比全景声Atmos</option>
	</select>
    </div>
     
    <div class="layui-input-inline" style="width:100px;">
      <select name="kiwi">
        <option value="">2D/3D</option>
        <option value="2D">2D</option>
        <option value="3D">3D</option>
      </select>
    </div>
      <div class="layui-input-inline" style="width:100px;">
      <select name="videocoding">
        <option value="">视频编码</option>
	    <option value="AVC">AVC</option>
	    <option value="VC1">VC1</option>
	    <option value="MVC">MVC</option>
	    <option value="HEVC">HEVC</option>
	    <option value="MPEG-2">MPEG-2</option>
	    <option value="Dolby Vision杜比视界">Dolby Vision杜比视界</option>
	    <option value="HDR">HDR</option>
	</select>
    </div>
	<div class="layui-inline">
		<input placeholder="请输入关键字" class="layui-input"
			name="keyword" id="keyword" autocomplete="off">
	</div>
	<div class="layui-btn" data-type="reload" id="reloadSubmit">
		<i class="layui-icon layui-icon-search"></i>立即搜索
	</div>
	<button type="reset" class="layui-btn layui-btn-primary">重置</button>
  </div>
</form>
</div>  
<table class="layui-hide" id="test"></table>
</body>
<script>
	layui.use('table', function(){
	  var table = layui.table;
	  var layer = layui.layer;
	  var index = layer.msg('数据加载中...', {icon: 16});
	  table.render({
	    elem: '#test'
	    ,url:'/FileLibrary/product/all.php'
    	,loading: true
	    ,cols: [[
	       {field:'sku', width:100, title: 'SKU'}
	      ,{field:'duckweedTitle', title: '标题', minWidth: 130}
	      ,{field:'state', width:60, title: '状态'}
	      ,{field:'senclosure', width:60, title: '版本'}
	      ,{field:'dielectric', width:60, title: '介质'}
	      ,{field:'spacking', width:60, title: '包装'}
	      ,{field:'subtitle', width:60, title: '字幕'}
	      ,{field:'dialogue', width:60, title: '对白'}
	      ,{field:'vocaltract', width:60, title: '声道'}
	      ,{field:'kiwi', width:70, title: '2D/3D'}
	      ,{field:'videocoding', width:100, title: '视频编码'}
	    ]]
	    ,page: true
	    ,done:function (res) {
	    	layer.close(index);
	    }
	  }); 
 
		var $ = layui.$, active = {
	        reload: function () {
	            var index = layer.msg('正在搜索中...', {icon: 6});
	            var state = $('select[name=state]').val();
	            var type = $('select[name=type]').val();
	            var dielectric = $('select[name=dielectric]').val();
	            var spacking = $('select[name=spacking]').val();
	            var subtitle = $('select[name=subtitle]').val();
	            var dialogue = $('select[name=dialogue]').val();
	            var audio = $('select[name=audio]').val();
	            var kiwi = $('select[name=kiwi]').val();
	            var videocoding = $('select[name=videocoding]').val();
	            var keyword = $('#keyword').val();
	            //执行重载
	            table.reload('test', {
	                url: '/FileLibrary/product/details.php'
	                , where: {
	                    state: state,
	                    type: type,
	                    dielectric: dielectric,
	                    spacking: spacking,
	                    subtitle: subtitle,
	                    dialogue: dialogue,
	                    audio: audio,
	                    kiwi: kiwi,
	                    videocoding: videocoding,
	                    keyword: keyword
	                }
	            	,page:{
	            		curr: 1
	            	}
		            ,done:function (res) {
		    	    	layer.close(index);
		    	    }
	            });
	        }
	    };
	    //监听搜索点击按钮
	    $('#reloadSubmit').on('click', function () {
	        var type = $(this).data('type');
	        active[type] ? active[type].call(this) : '';
	    });
	   
	});
</script>
</html>