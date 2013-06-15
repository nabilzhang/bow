Ext.define('Bow.controller.Banner', {
    extend: 'Ext.app.Controller',

    views: ['Banner@Bow.view'],
    
    init: function() {
        this.control({
        	 'viewport > banner': {
             },
        });
    },
});