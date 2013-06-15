Ext.define('Bow.controller.Tree', {
    extend: 'Ext.app.Controller',

    stores:['TreeMenu@Bow.store'],
    views: ['Tree@Bow.view.leftTree'],
    
    init: function() {
        this.control({
        	 'viewport > left_tree': {
             },
        });
    },
});