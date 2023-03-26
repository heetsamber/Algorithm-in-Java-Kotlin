class TreeNode<T>(value:T){
    var value:T = value
    var parent:TreeNode<T>? = null

    var children:MutableList<TreeNode<T>> = mutableListOf()

    fun addChild(node:TreeNode<T>){
        children.add(node)
        node.parent = this
    }
    override fun toString(): String {
        var s = "${value}"
        if (!children.isEmpty()) {
            s += " {" + children.map { it.toString() } + " }"
        }
        return s
    }
}

fun main(args: Array<String>) {
    val milkTree = TreeNode<String>( "Milk")
    val beveragesNode = TreeNode<String>( "Beverages")
    val curdNode = TreeNode<String>( "Curd")
    milkTree.addChild(beveragesNode)
    milkTree.addChild(curdNode)

    val teaNode = TreeNode<String>( "tea")
    val coffeeNode = TreeNode<String>( "coffee")
    val milkShakeNode = TreeNode<String>( "Milk Shake")
    beveragesNode.addChild(teaNode)
    beveragesNode.addChild(coffeeNode)
    beveragesNode.addChild(milkShakeNode)

    val gingerTeaNode = TreeNode<String>( "ginger tea")
    val normalTeaNode = TreeNode<String>( "normal tea")
    teaNode.addChild(gingerTeaNode)
    teaNode.addChild(normalTeaNode)

    val yogurtNode = TreeNode<String>( "yogurt")
    val lassiNode = TreeNode<String>( "lassi")
    curdNode.addChild(yogurtNode)
    curdNode.addChild(lassiNode)

    println(milkTree)
}
