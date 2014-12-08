<#import "/spring.ftl" as spring />
<#import "macro.ftl" as macro/>
<@macro.showHeader />
<div class="row-fluid inner-col" ng-controller="AddArticleCtrl">
	<div class="span6">
		<form class="form-horizontal">
			<div class="control-group">
				<label class="control-label" for="title">Title</label>
				<div class="controls">
					<input type="text" name="title" ng-model="title" class="input-xxlarge" >
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="title">Problem</label>
				<div class="controls">
					<textarea ng-model="problem" name="problem" class="input-xxlarge"></textarea>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="title">Solution</label>
				<div class="controls">
					<textarea ng-model="solution" name="solution" class="input-xxlarge"></textarea>
				</div>
			</div>
			
			 <div class="form-actions">
			    <button type="button" class="btn btn-info" ng-click="saveArticle()">Save changes</button>
			    <button type="button" class="btn">Cancel</button>
    		</div>
		</form>
	</div>
	<table class="table">
		<thead>
			<tr>
				<th>Title</th>
				<th>Problem</th>
			</tr>
		</thead>
		<tbody>
			<tr ng-repeat="article in articleList">
				<td>{{article.title}}</td>
				<td>{{article.problem}}</td>
			</tr>
		</tbody>
	
	</table>
</div>
<@macro.showFooter>
	<script type="text/javascript" src="${rc.getContextPath()}/resources/js/pages/addArticle.js"></script>
</@macro.showFooter>