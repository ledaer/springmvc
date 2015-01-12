function init_menu_li(theArray, theHtmlObject) {
	var top_menu = [];

	for (var key in zNodes) {
		if (zNodes[key].pId == "0") {
			top_menu.push(new menu_node(zNodes[key].id, zNodes[key].u, zNodes[key].name));
		} else {
			pushNodeToArray(top_menu, zNodes[key]);
		}
	}

	return nodeArrayToString(top_menu);

}

function menu_node(theId, theUrl, theName) {
	this.id = theId;
	this.url = theUrl;
	this.name = theName;
	this.child_nodes = [];
}

function pushNodeToArray(theArray, theNode) {
	for (var key in theArray) {
		if (theNode.pId == theArray[key].id) {
			theArray[key].child_nodes.push(new menu_node(theNode.id, theNode.u, theNode.name));
			return true;
		} else if (pushNodeToArray(theArray[key].child_nodes, theNode)) {
			return true;
		}
	}
	return false;
}

function nodeArrayToString(theArray) {
	var returnStr = "";
	if (theArray[0].url == "") {
		returnStr += "<ul class=\"menu_top_ul\">";
	} else {
		returnStr += "<ul class=\"menu_ul\">";
	}

	for (var key in theArray) {
		if (theArray[key].url == "") {
			returnStr += "<li class=\"menu_li top\">";
		} else {
			returnStr += "<li class=\"menu_li\">";
		}

		returnStr += "<a href=\"";

		if (theArray[key].url == "") {
			returnStr += "javascript:void(0)";
		} else {
			returnStr += theArray[key].url;
		}

		returnStr += "\" target=\"mainFrame\">";
		returnStr += theArray[key].name;
		returnStr += "</a>";
		returnStr += "</li>";
		if (theArray[key].child_nodes.length != 0) {
			returnStr += nodeArrayToString(theArray[key].child_nodes);
		}
	}
	returnStr += "</ul>";
	return returnStr;
}