package com.aistra.hail.app

/**
 * 用户分组（标签）。
 *
 * @param name 分组名，[HailData.tags] 中唯一。
 * @param id 分组 id，[AppInfo.tagIdList] 引用它；0 为内置默认分组。
 * @param mode 该分组独立的冻结模式，为 null 时跟随全局工作模式（[HailData.workingMode]）。
 */
data class TagInfo(
    val name: String,
    val id: Int,
    val mode: String? = null
) {
    /** 该分组实际使用的冻结模式：自身配置优先，否则跟随全局。 */
    fun resolveMode(): String = mode ?: HailData.workingMode
}
