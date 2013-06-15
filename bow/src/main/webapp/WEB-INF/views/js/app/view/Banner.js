/**
 * The application header displayed at the top of the viewport
 * @extends Ext.Component
 */
Ext.define('Bow.view.Banner', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.banner',

	autoShow:true,
	margins: '0 0 5 0',
	height:100,
    initComponent: function() {
        Ext.applyIf(this, {
        	contentEl:'header',
        });
        this.callParent(arguments);
    }
});