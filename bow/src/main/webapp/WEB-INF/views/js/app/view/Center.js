/**
 * The application header displayed at the top of the viewport
 * @extends Ext.Component
 */
Ext.define('Bow.view.Center', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.center',
    
	hideBorders:true,
	autoShow:true,
    initComponent: function() {
        Ext.applyIf(this, {
            html: 'Center'
        });
        this.callParent(arguments);
    }
});