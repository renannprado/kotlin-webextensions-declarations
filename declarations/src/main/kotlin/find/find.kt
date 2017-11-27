package find

import kotlin.js.Promise

class Params(
    /**
     * Tab to query. Defaults to the active tab.
     */
    val tabId: Int,
    /**
     * Find only ranges with case sensitive match.
     */
    val caseSensitive: Boolean,
    /**
     * Find only ranges that match entire word.
     */
    val entireWord: Boolean,
    /**
     * Return rectangle data which describes visual position of search results.
     */
    val includeRectData: Boolean,
    /**
     * Return range data which provides range data in a serializable form.
     */
    val includeRangeData: Boolean
)

class Params(
    /**
     * Found range to be highlighted. Default highlights all ranges.
     */
    val rangeIndex: Int,
    /**
     * Tab to highlight. Defaults to the active tab.
     */
    val tabId: Int,
    /**
     * Don't scroll to highlighted item.
     */
    val noScroll: Boolean
)

external class Find {
  /**
   * Search for text in document and store found ranges in array, in document order.
   */
  fun find(queryphrase: String, params: Params): Promise<Any> {
  }

  /**
   * Highlight a range
   */
  fun highlightResults(params: Params): Promise<Any> {
  }

  /**
   * Remove all highlighting from previous searches.
   */
  fun removeHighlighting(tabId: Int): Promise<Any> {
  }
}
