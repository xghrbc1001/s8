var html="";	
var bankuai= function() {$.get("./bankuai", {
	Action : "get"
}, function(data, textStatus) {
	// 遍历json数组
	$.each(data,function(key,values) {
		html="";
		html+="<div class=\"span3 fl\">"+
        "<div class=\"thumbnail\">"+
          "<h2>"+key+"</h2>"+
          "<div class=\"caption\">"+
          	"<table class=\"table table-striped\">"+
          		"<thead>"+
          			"<tr >"+
          				"<th>名称</th>"+
          				"<th>现价</th>"+
          				"<th>涨幅</th>"+
          			"</tr>"+
          		"</thead>"+
          		"<tbody>";
          			
     
      
		$.each(values,function(i,val){
			console.log(val.buy1Price);
			percentage=val.percentage;
			if(percentage >=0){
				html+="<tr style=\"color:red\">";
			}else{
				html+="<tr style=\"color:green\">";
			}
				html+="<td>"+val.name+"</td>"+
				"<td>"+val.currentPrice+"</td>"+
				"<td>"+val.percentage+"</td>"+
			"</tr>";
		});
		html+="   <tbody></table></div></div></div>";
	});
	
	console.log(html);
	$("#bankuai").html(html);
});
}

setInterval("bankuai()", 1000);

