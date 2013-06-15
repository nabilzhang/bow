/**
 * The main application viewport, which displays the whole application
 * 
 * @extends Ext.Viewport
 */
Ext.define('Bow.view.Viewport', {
	extend : 'Ext.container.Viewport',
	layout : 'border',
	hideBorders : true,
	requires : ['Bow.view.Center'],

	items : [ 
	{
		region : 'north',
		xtype : 'banner',
		height : 80
	}, 
	{
		region : 'center',
		xtype : 'center'
	}
	, 
	{
		region : 'west',
		width : 200,
		xtype : 'left_tree'
	} 
	]
});