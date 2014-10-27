function config_menu(nodes) {
	YUI().use('node', 'anim', 'transition', function(Y) {
		var beforeOpenLi = null;

		Y.one("#left").setHTML(init_menu_li(nodes));

		Y.all(".menu_ul").setStyle("height", 0);

		//Y.all(".menu_ul").hide();

		Y.all(".menu_li").on("click", menuLiClick);


		function menuLiClick(e) {
			triggerul(Y.one(e.currentTarget), true);
		}

		function triggerul(li, firstSign) {
			var ul = li.next();

			if (ul == null || ul.get("tagName").toLowerCase() != "ul") {
				return;
			}



			if (li.hasClass("open")) {
				var anim = new Y.Anim({
					duration: 0.2,
					node: ul,
					to: {
						height: 0
					}
				});
				anim.run();

				//ul.setStyle("display", "none");
				//ul.hide();
				/**
				ul.transition({
					easing: 'ease-in',
					duration: 5,
					height: '0px'
				});**/
				li.removeClass("open");
			} else {
				var anim = new Y.Anim({
					duration: 0.2,
					node: ul,
					to: {
						height: '100%'
					}
				});
				anim.run();

				// ul.setStyle("display", "");
				//ul.show();
				/**
				ul.transition({
					easing: 'ease-out',
					duration: 10,
					height: 'auto'
				});**/
				li.addClass("open");
			}
			if (beforeOpenLi != null && firstSign && beforeOpenLi.hasClass("open") && beforeOpenLi != li) {
				triggerul(beforeOpenLi, false);
			}
			if (li.hasClass("top")) {
				beforeOpenLi = li;
			}
		}

	});
}