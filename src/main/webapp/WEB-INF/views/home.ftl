<#import "/spring.ftl" as spring />
<#import "macro.ftl" as macro/>
<@macro.showHeader />
<div class="row-fluid inner-col" ng-controller="HomeCtrl">
	<div class="span12">				
			<h3>Bookmarks</h3>
			Save, Share, and Recall anything that you find online. Safely store and organize your browser bookmarks and favorites online so you can access them anytime - anywhere. Save all your favorites in one secure online location and protect them from computer crashes and viruses. Share your favorites with anybody or keep them private. You are in full control of your data.
			<ul>
				<li>Store and organize your favorites online </li>
				<li>Easily share favorites with others</li>
				<li>Access Anytime - Anywhere</li>
				<li>Add your notes and descriptions</li>
			</ul>
		</div>

		<div class="features-storage-text">
		<h3>Powerful Bookmark Management</h3>
		<div>Favorites, or bookmarks, can be extremely useful in providing quick and easy access to web sites you visit regularly, or web sites where the web address cannot easily be remembered. The common problem is that you may have several sets of you favorites: one at work, another one at home, and another set on your laptop. It can be very frustrating when you need to recall bookmarks saved on your work computer from home. With <i>Online Bookmark</i> you can manage all your favorites in one convenient and secure online location, and assess them whenever you need them (whether that's at work, at home, friend's house, or anywhere else).</div>
		<h3>Save your Research</h3>
		<div>Doing a research on something? <i>Online Bookmark</i> can help you organize everything that you'll find online. Create your own favorite sites category, and add related links with custom titles, descriptions, comments for everything that you'll find.</div>
		</div>
							
	</div>
	
</div>
<@macro.showFooter>
	<script type="text/javascript" src="${rc.getContextPath()}/resources/js/pages/home.js"></script>
</@macro.showFooter>