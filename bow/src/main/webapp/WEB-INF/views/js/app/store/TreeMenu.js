Ext.define('Bow.store.TreeMenu', {
	extend : 'Ext.data.TreeStore',

	root : {
		expanded : true,
		text : "菜单",
		user : "",
		status : "",
		children : [ {
			text : "采购管理",
			children : [ {
				text : "采购订单列表",
				leaf : true
			}, {
				text : "新建采购订单",
				leaf : true
			} ]
		}, {
			text : "销售管理",
			children : [ {
				text : "销售订单列表",
				leaf : true
			}, {
				text : "新建销售订单",
				leaf : true
			} ]
		}, {
			text : "库存管理",
			children : [ {
				text : "商品库存列表",
				leaf : true
			}, {
				text : "入库管理",
				leaf : true
			}, {
				text : "出库管理",
				leaf : true
			} ]
		}, {
			text : "配送管理",
			children : [ {
				text : "配送单列表",
				leaf : true
			}, {
				text : "新建配送单",
				leaf : true
			} ]
		}, {
			text : "统计分析",
			children : [ {
				text : "采购统计",
				leaf : true
			}, {
				text : "销售统计",
				leaf : true
			}, {
				text : "库存统计",
				leaf : true
			} ]
		}, {
			text : "基础信息",
			children : [ {
				text : "地区管理",
				leaf : true
			}, {
				text : "客户管理",
				leaf : true
			}, {
				text : "业务员管理",
				leaf : true
			}, {
				text : "岗位管理",
				leaf : true
			}, {
				text : "部门管理",
				leaf : true
			}, {
				text : "供货商管理",
				leaf : true
			}, {
				text : "商品分类管理",
				leaf : true
			}, {
				text : "商品管理",
				leaf : true
			} ]
		}, {
			text : "用户权限管理",
			children : [ {
				text : "所有用户",
				leaf : true,
				id: "user-all"
			}, {
				text : "用户组管理",
				leaf : true,
				id : "user-group"
			}, {
				text : "系统日志",
				leaf : true,
				id : "user-systemlog"
			} ]
		} ],
	}
});