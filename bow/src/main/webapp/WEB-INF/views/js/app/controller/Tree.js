Ext.define('Bow.controller.Tree', {
    extend: 'Ext.app.Controller',

    stores:['TreeMenu@Bow.store'],
    views: ['Tree@Bow.view.leftTree'],
    
    init: function() {
        this.control({
        	 'viewport > left_tree': {
        		 itemclick:this.showView
             },
        });
    },
    
    showView:function(view, record, items, index, e){
		if(!record.data.leaf){
			return;
		}
		switch(record.data.id){
			case 'user-all':
				console.log(record.data.text);
				break;
			default:
				return;
		}
		
	}
});