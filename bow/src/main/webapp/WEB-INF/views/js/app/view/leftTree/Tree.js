/**
 * The application header displayed at the top of the viewport
 * 
 * @extends Ext.Component
 */
Ext.define('Bow.view.leftTree.Tree', {
	extend : 'Ext.tree.TreePanel',
	alias : 'widget.left_tree',
	
	title : '系统菜单',
	id : 'tree',
	store : 'TreeMenu',
	slide : true,
	split : true,
	collapsible : true,
	scroll : true,
	initComponent : function() {
		this.callParent(arguments);
	}
});