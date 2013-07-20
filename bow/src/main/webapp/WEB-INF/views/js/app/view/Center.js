/**
 * The application header displayed at the top of the viewport
 * @extends Ext.Component
 */
Ext.define('Bow.view.Center', {
    extend: 'Ext.tab.Panel',
    alias: 'widget.center',
    
	hideBorders:true,
	autoShow:true,	
	height:'100%',
	layout:'fit',
	items:[{
		id:'welcome',
		title:'欢迎页',
		html:'coming soon',
		closable:true,
	}],
	split:true,
    initComponent: function() {
        Ext.applyIf(this, {
           
        });
        this.callParent(arguments);
    }
});