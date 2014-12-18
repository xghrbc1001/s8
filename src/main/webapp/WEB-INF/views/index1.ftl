<#import "/spring.ftl" as spring />
<#import "macro.ftl" as macro/>
<@macro.showHeader />

hello,
${name}

<@macro.showFooter>
	<script type="text/javascript" src="${rc.getContextPath()}/resources/js/pages/index.js"></script>
</@macro.showFooter>