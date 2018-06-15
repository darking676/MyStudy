<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/960.css"/>
<link rel="stylesheet" href="css/jquery.bxslider.min.css"/>
<style type="text/css">

	#menu{
		background-color: #cccccc;
		/* overflow: hidden; */
	}
	#menu>ul{
		width: 488px;
		padding: 0px;
		margin: 0px auto;
		position: relative;
	}
	#menu>ul>li{
		margin: 0px 1px;
		list-style: none;
		float: left;
	}
	#menu>ul>li>a{
		width: 120px;
		height:30px;
		display:inline-block;
		background-color: gray;
		text-align: center;
		color: white;
		text-decoration: none;
	}
	#menu>ul>li>a:hover{
		background-color: red;
	}
	#menu>ul>li>a:first-child~a{
		display: none;
		position: absolute;
		z-index: 1;
	}
	/* #menu>ul>li>a:first-child+a{
		top: 30px;
	}
	#menu>ul>li>a:first-child+a+a{
		top: 60px;
	} */

</style>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="js/jquery-ui.js"></script>
<script type="text/javascript" src="js/jquery.bxslider.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#menu>ul>li>a:first-child~a').each(function(idx,ele){
			var order=$(ele).parent().children().index(ele);
			$(ele).css('top',30*order+'px');
		});
		$('.bxslider').bxSlider({
			  mode: 'fade',
			  slideWidth: 320
		});
		$('#menu>ul>li>a').each(function(idx,ele){
			$(ele).mouseenter(function(){
				$(this).parent().children().css('display','block');
			}).mouseleave(function(){
				$('#menu>ul>li>a:first-child~a').css('display','none');
			});
		});
		$('.form>button').click(function(){
			var id=$(this).parent().children().filter('input').first().val();
			var pw=$(this).parent().children().filter('input').last().val();
			var param={'id':id,'pw':pw};
			$.ajax({
				url:'login.json',
				type:'POST',
				data:param,
				success:function(data){
					var id=data.login[0].user;
					var result=data.login[0].result;
					if(result){
						$('.form').html("<h4>"+id+"님 환영합니다</h4>");
					}else{
						alert('다시 확인하세요');
						$('.form>input').eq(0).select();
					}
				}
			});
		});
	});
</script>
</head>
<body>
	<div class="container_12">
		<div id="header">
		<div class="grid_7">
			<h1>비트교육센터</h1>
		</div>
		<div class="grid_5 form">
			<span>id</span><input />
			<span>pw</span><input />
			<button>로그인</button>
		</div>
		</div>
		<div class="clear"></div>
		<div id="menu" class="grid_12">
			<ul>
				<li><a href="#">menu1</a><a href="#">menu1-1</a><a href="#">menu1-2</a></li>
				<li><a href="#">menu2</a><a href="#">menu2-1</a><a href="#">menu2-2</a><a href="#">menu2-3</a></li>
				<li><a href="#">menu3</a><a href="#">menu3-1</a><a href="#">menu3-2</a><a href="#">menu3-3</a><a href="#">menu3-4</a></li>
				<li><a href="#">menu4</a><a href="#">menu4-1</a><a href="#">menu4-2</a></li>
			</ul>
		</div>
		<div class="clear"></div>
		<div class="grid_12 content">
			<div class="bxslider">
				<div><img alt="img" src="images/big01.jpg"/></div>
				<div><img alt="img" src="images/big02.jpg"/></div>
				<div><img alt="img" src="images/big03.jpg"/></div>
				<div><img alt="img" src="images/big04.jpg"/></div>
				<div><img alt="img" src="images/big05.jpg"/></div>
				<div><img alt="img" src="images/big06.jpg"/></div>
			</div>
		</div>
		<div class="clear"></div>
		<div id="footer" class="grid_12">
			<address>비트캠프 서울시 서초구 서초동 1327-15 비트아카데미빌딩</address>
			Copyright &copy; 비트캠프 All rights reserved.
		</div>
		<div class="clear"></div>		
	</div>
</body>
</html>









