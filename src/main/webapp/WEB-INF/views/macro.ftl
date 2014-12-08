<#import "/spring.ftl" as spring />

<#macro showHeader htmlclass="">
<!DOCTYPE HTML>
	<head>
		<meta charset="utf-8">
	
		
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title></title>
		<meta name="description" content="">
		<meta name="author" content="">
		<meta name="viewport" content="width=device-width,initial-scale=1">
		
		<#include "external-css-loader.ftl" />
	</head>
	
	<body>
		<#include "navigation-loader.ftl" />
		
		<#nested/>

		<div class="container" ng-app>
			<div class="content inner-col">
				
</#macro>

<#macro showFooter>
			</div><!-- end of content -->

		
		</div><!-- end of container -->
<#include "footer.ftl" />
		<script type="text/javascript">
			var _context = '${rc.getContextPath()}';
		</script>

		<#include "external-js-loader.ftl" />
 
		<#nested>
	</body>
	</html>
</#macro>
