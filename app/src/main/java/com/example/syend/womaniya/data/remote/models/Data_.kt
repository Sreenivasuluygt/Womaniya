package com.example.syend.womaniya.data.remote.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class Data_{

    @SerializedName("approved_at_utc")
    @Expose
    private var approvedAtUtc: Any? = null
    @SerializedName("subreddit")
    @Expose
    private var subreddit: String? = null
    @SerializedName("selftext")
    @Expose
    private var selftext: String? = null
    @SerializedName("user_reports")
    @Expose
    private var userReports: List<Any>? = null
    @SerializedName("saved")
    @Expose
    private var saved: Boolean? = null
    @SerializedName("mod_reason_title")
    @Expose
    private var modReasonTitle: Any? = null
    @SerializedName("gilded")
    @Expose
    private var gilded: Int? = null
    @SerializedName("clicked")
    @Expose
    private var clicked: Boolean? = null
    @SerializedName("title")
    @Expose
    private var title: String? = null
    @SerializedName("link_flair_richtext")
    @Expose
    private var linkFlairRichtext: List<Any>? = null
    @SerializedName("subreddit_name_prefixed")
    @Expose
    private var subredditNamePrefixed: String? = null
    @SerializedName("hidden")
    @Expose
    private var hidden: Boolean? = null
    @SerializedName("pwls")
    @Expose
    private var pwls: Int? = null
    @SerializedName("link_flair_css_class")
    @Expose
    private var linkFlairCssClass: Any? = null
    @SerializedName("downs")
    @Expose
    private var downs: Int? = null
    @SerializedName("thumbnail_height")
    @Expose
    private var thumbnailHeight: Int? = null
    @SerializedName("parent_whitelist_status")
    @Expose
    private var parentWhitelistStatus: String? = null
    @SerializedName("hide_score")
    @Expose
    private var hideScore: Boolean? = null
    @SerializedName("name")
    @Expose
    private var name: String? = null
    @SerializedName("quarantine")
    @Expose
    private var quarantine: Boolean? = null
    @SerializedName("link_flair_text_color")
    @Expose
    private var linkFlairTextColor: String? = null
    @SerializedName("author_flair_background_color")
    @Expose
    private var authorFlairBackgroundColor: Any? = null
    @SerializedName("subreddit_type")
    @Expose
    private var subredditType: String? = null
    @SerializedName("ups")
    @Expose
    private var ups: Int? = null
    @SerializedName("domain")
    @Expose
    private var domain: String? = null
    @SerializedName("media_embed")
    @Expose
    private var mediaEmbed: MediaEmbed? = null
    @SerializedName("thumbnail_width")
    @Expose
    private var thumbnailWidth: Int? = null
    @SerializedName("author_flair_template_id")
    @Expose
    private var authorFlairTemplateId: Any? = null
    @SerializedName("is_original_content")
    @Expose
    private var isOriginalContent: Boolean? = null
    @SerializedName("secure_media")
    @Expose
    private var secureMedia: Any? = null
    @SerializedName("is_reddit_media_domain")
    @Expose
    private var isRedditMediaDomain: Boolean? = null
    @SerializedName("is_meta")
    @Expose
    private var isMeta: Boolean? = null
    @SerializedName("category")
    @Expose
    private var category: Any? = null
    @SerializedName("secure_media_embed")
    @Expose
    private var secureMediaEmbed: SecureMediaEmbed? = null
    @SerializedName("link_flair_text")
    @Expose
    private var linkFlairText: Any? = null
    @SerializedName("can_mod_post")
    @Expose
    private var canModPost: Boolean? = null
    @SerializedName("score")
    @Expose
    private var score: Int? = null
    @SerializedName("approved_by")
    @Expose
    private var approvedBy: Any? = null
    @SerializedName("thumbnail")
    @Expose
    private var thumbnail: String? = null
    @SerializedName("edited")
    @Expose
    private var edited: Boolean? = null
    @SerializedName("author_flair_css_class")
    @Expose
    private var authorFlairCssClass: Any? = null
    @SerializedName("author_flair_richtext")
    @Expose
    private var authorFlairRichtext: List<Any>? = null
    @SerializedName("post_hint")
    @Expose
    private var postHint: String? = null
    @SerializedName("content_categories")
    @Expose
    private var contentCategories: Any? = null
    @SerializedName("is_self")
    @Expose
    private var isSelf: Boolean? = null
    @SerializedName("mod_note")
    @Expose
    private var modNote: Any? = null
    @SerializedName("created")
    @Expose
    private var created: Int? = null
    @SerializedName("link_flair_type")
    @Expose
    private var linkFlairType: String? = null
    @SerializedName("wls")
    @Expose
    private var wls: Int? = null
    @SerializedName("banned_by")
    @Expose
    private var bannedBy: Any? = null
    @SerializedName("author_flair_type")
    @Expose
    private var authorFlairType: String? = null
    @SerializedName("contest_mode")
    @Expose
    private var contestMode: Boolean? = null
    @SerializedName("selftext_html")
    @Expose
    private var selftextHtml: Any? = null
    @SerializedName("likes")
    @Expose
    private var likes: Any? = null
    @SerializedName("suggested_sort")
    @Expose
    private var suggestedSort: Any? = null
    @SerializedName("banned_at_utc")
    @Expose
    private var bannedAtUtc: Any? = null
    @SerializedName("view_count")
    @Expose
    private var viewCount: Any? = null
    @SerializedName("archived")
    @Expose
    private var archived: Boolean? = null
    @SerializedName("no_follow")
    @Expose
    private var noFollow: Boolean? = null
    @SerializedName("is_crosspostable")
    @Expose
    private var isCrosspostable: Boolean? = null
    @SerializedName("pinned")
    @Expose
    private var pinned: Boolean? = null
    @SerializedName("over_18")
    @Expose
    private var over18: Boolean? = null
    @SerializedName("preview")
    @Expose
    private var preview: Preview? = null
    @SerializedName("media_only")
    @Expose
    private var mediaOnly: Boolean? = null
    @SerializedName("link_flair_template_id")
    @Expose
    private var linkFlairTemplateId: Any? = null
    @SerializedName("can_gild")
    @Expose
    private var canGild: Boolean? = null
    @SerializedName("spoiler")
    @Expose
    private var spoiler: Boolean? = null
    @SerializedName("locked")
    @Expose
    private var locked: Boolean? = null
    @SerializedName("author_flair_text")
    @Expose
    private var authorFlairText: Any? = null
    @SerializedName("visited")
    @Expose
    private var visited: Boolean? = null
    @SerializedName("num_reports")
    @Expose
    private var numReports: Any? = null
    @SerializedName("distinguished")
    @Expose
    private var distinguished: Any? = null
    @SerializedName("subreddit_id")
    @Expose
    private var subredditId: String? = null
    @SerializedName("mod_reason_by")
    @Expose
    private var modReasonBy: Any? = null
    @SerializedName("removal_reason")
    @Expose
    private var removalReason: Any? = null
    @SerializedName("link_flair_background_color")
    @Expose
    private var linkFlairBackgroundColor: String? = null
    @SerializedName("id")
    @Expose
    private var id: String? = null
    @SerializedName("report_reasons")
    @Expose
    private var reportReasons: Any? = null
    @SerializedName("author")
    @Expose
    private var author: String? = null
    @SerializedName("num_crossposts")
    @Expose
    private var numCrossposts: Int? = null
    @SerializedName("num_comments")
    @Expose
    private var numComments: Int? = null
    @SerializedName("send_replies")
    @Expose
    private var sendReplies: Boolean? = null
    @SerializedName("mod_reports")
    @Expose
    private var modReports: List<Any>? = null
    @SerializedName("author_flair_text_color")
    @Expose
    private var authorFlairTextColor: Any? = null
    @SerializedName("permalink")
    @Expose
    private var permalink: String? = null
    @SerializedName("whitelist_status")
    @Expose
    private var whitelistStatus: String? = null
    @SerializedName("stickied")
    @Expose
    private var stickied: Boolean? = null
    @SerializedName("url")
    @Expose
    private var url: String? = null
    @SerializedName("subreddit_subscribers")
    @Expose
    private var subredditSubscribers: Int? = null
    @SerializedName("created_utc")
    @Expose
    private var createdUtc: Int? = null
    @SerializedName("media")
    @Expose
    private var media: Any? = null
    @SerializedName("is_video")
    @Expose
    private var isVideo: Boolean? = null

    fun getApprovedAtUtc(): Any? {
        return approvedAtUtc
    }

    fun setApprovedAtUtc(approvedAtUtc: Any) {
        this.approvedAtUtc = approvedAtUtc
    }

    fun getSubreddit(): String? {
        return subreddit
    }

    fun setSubreddit(subreddit: String) {
        this.subreddit = subreddit
    }

    fun getSelftext(): String? {
        return selftext
    }

    fun setSelftext(selftext: String) {
        this.selftext = selftext
    }

    fun getUserReports(): List<Any>? {
        return userReports
    }

    fun setUserReports(userReports: List<Any>) {
        this.userReports = userReports
    }

    fun getSaved(): Boolean? {
        return saved
    }

    fun setSaved(saved: Boolean?) {
        this.saved = saved
    }

    fun getModReasonTitle(): Any? {
        return modReasonTitle
    }

    fun setModReasonTitle(modReasonTitle: Any) {
        this.modReasonTitle = modReasonTitle
    }

    fun getGilded(): Int? {
        return gilded
    }

    fun setGilded(gilded: Int?) {
        this.gilded = gilded
    }

    fun getClicked(): Boolean? {
        return clicked
    }

    fun setClicked(clicked: Boolean?) {
        this.clicked = clicked
    }

    fun getTitle(): String? {
        return title
    }

    fun setTitle(title: String) {
        this.title = title
    }

    fun getLinkFlairRichtext(): List<Any>? {
        return linkFlairRichtext
    }

    fun setLinkFlairRichtext(linkFlairRichtext: List<Any>) {
        this.linkFlairRichtext = linkFlairRichtext
    }

    fun getSubredditNamePrefixed(): String? {
        return subredditNamePrefixed
    }

    fun setSubredditNamePrefixed(subredditNamePrefixed: String) {
        this.subredditNamePrefixed = subredditNamePrefixed
    }

    fun getHidden(): Boolean? {
        return hidden
    }

    fun setHidden(hidden: Boolean?) {
        this.hidden = hidden
    }

    fun getPwls(): Int? {
        return pwls
    }

    fun setPwls(pwls: Int?) {
        this.pwls = pwls
    }

    fun getLinkFlairCssClass(): Any? {
        return linkFlairCssClass
    }

    fun setLinkFlairCssClass(linkFlairCssClass: Any) {
        this.linkFlairCssClass = linkFlairCssClass
    }

    fun getDowns(): Int? {
        return downs
    }

    fun setDowns(downs: Int?) {
        this.downs = downs
    }

    fun getThumbnailHeight(): Int? {
        return thumbnailHeight
    }

    fun setThumbnailHeight(thumbnailHeight: Int?) {
        this.thumbnailHeight = thumbnailHeight
    }

    fun getParentWhitelistStatus(): String? {
        return parentWhitelistStatus
    }

    fun setParentWhitelistStatus(parentWhitelistStatus: String) {
        this.parentWhitelistStatus = parentWhitelistStatus
    }

    fun getHideScore(): Boolean? {
        return hideScore
    }

    fun setHideScore(hideScore: Boolean?) {
        this.hideScore = hideScore
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getQuarantine(): Boolean? {
        return quarantine
    }

    fun setQuarantine(quarantine: Boolean?) {
        this.quarantine = quarantine
    }

    fun getLinkFlairTextColor(): String? {
        return linkFlairTextColor
    }

    fun setLinkFlairTextColor(linkFlairTextColor: String) {
        this.linkFlairTextColor = linkFlairTextColor
    }

    fun getAuthorFlairBackgroundColor(): Any? {
        return authorFlairBackgroundColor
    }

    fun setAuthorFlairBackgroundColor(authorFlairBackgroundColor: Any) {
        this.authorFlairBackgroundColor = authorFlairBackgroundColor
    }

    fun getSubredditType(): String? {
        return subredditType
    }

    fun setSubredditType(subredditType: String) {
        this.subredditType = subredditType
    }

    fun getUps(): Int? {
        return ups
    }

    fun setUps(ups: Int?) {
        this.ups = ups
    }

    fun getDomain(): String? {
        return domain
    }

    fun setDomain(domain: String) {
        this.domain = domain
    }

    fun getMediaEmbed(): MediaEmbed? {
        return mediaEmbed
    }

    fun setMediaEmbed(mediaEmbed: MediaEmbed) {
        this.mediaEmbed = mediaEmbed
    }

    fun getThumbnailWidth(): Int? {
        return thumbnailWidth
    }

    fun setThumbnailWidth(thumbnailWidth: Int?) {
        this.thumbnailWidth = thumbnailWidth
    }

    fun getAuthorFlairTemplateId(): Any? {
        return authorFlairTemplateId
    }

    fun setAuthorFlairTemplateId(authorFlairTemplateId: Any) {
        this.authorFlairTemplateId = authorFlairTemplateId
    }

    fun getIsOriginalContent(): Boolean? {
        return isOriginalContent
    }

    fun setIsOriginalContent(isOriginalContent: Boolean?) {
        this.isOriginalContent = isOriginalContent
    }

    fun getSecureMedia(): Any? {
        return secureMedia
    }

    fun setSecureMedia(secureMedia: Any) {
        this.secureMedia = secureMedia
    }

    fun getIsRedditMediaDomain(): Boolean? {
        return isRedditMediaDomain
    }

    fun setIsRedditMediaDomain(isRedditMediaDomain: Boolean?) {
        this.isRedditMediaDomain = isRedditMediaDomain
    }

    fun getIsMeta(): Boolean? {
        return isMeta
    }

    fun setIsMeta(isMeta: Boolean?) {
        this.isMeta = isMeta
    }

    fun getCategory(): Any? {
        return category
    }

    fun setCategory(category: Any) {
        this.category = category
    }

    fun getSecureMediaEmbed(): SecureMediaEmbed? {
        return secureMediaEmbed
    }

    fun setSecureMediaEmbed(secureMediaEmbed: SecureMediaEmbed) {
        this.secureMediaEmbed = secureMediaEmbed
    }

    fun getLinkFlairText(): Any? {
        return linkFlairText
    }

    fun setLinkFlairText(linkFlairText: Any) {
        this.linkFlairText = linkFlairText
    }

    fun getCanModPost(): Boolean? {
        return canModPost
    }

    fun setCanModPost(canModPost: Boolean?) {
        this.canModPost = canModPost
    }

    fun getScore(): Int? {
        return score
    }

    fun setScore(score: Int?) {
        this.score = score
    }

    fun getApprovedBy(): Any? {
        return approvedBy
    }

    fun setApprovedBy(approvedBy: Any) {
        this.approvedBy = approvedBy
    }

    fun getThumbnail(): String? {
        return thumbnail
    }

    fun setThumbnail(thumbnail: String) {
        this.thumbnail = thumbnail
    }

    fun getEdited(): Boolean? {
        return edited
    }

    fun setEdited(edited: Boolean?) {
        this.edited = edited
    }

    fun getAuthorFlairCssClass(): Any? {
        return authorFlairCssClass
    }

    fun setAuthorFlairCssClass(authorFlairCssClass: Any) {
        this.authorFlairCssClass = authorFlairCssClass
    }

    fun getAuthorFlairRichtext(): List<Any>? {
        return authorFlairRichtext
    }

    fun setAuthorFlairRichtext(authorFlairRichtext: List<Any>) {
        this.authorFlairRichtext = authorFlairRichtext
    }

    fun getPostHint(): String? {
        return postHint
    }

    fun setPostHint(postHint: String) {
        this.postHint = postHint
    }

    fun getContentCategories(): Any? {
        return contentCategories
    }

    fun setContentCategories(contentCategories: Any) {
        this.contentCategories = contentCategories
    }

    fun getIsSelf(): Boolean? {
        return isSelf
    }

    fun setIsSelf(isSelf: Boolean?) {
        this.isSelf = isSelf
    }

    fun getModNote(): Any? {
        return modNote
    }

    fun setModNote(modNote: Any) {
        this.modNote = modNote
    }

    fun getCreated(): Int? {
        return created
    }

    fun setCreated(created: Int?) {
        this.created = created
    }

    fun getLinkFlairType(): String? {
        return linkFlairType
    }

    fun setLinkFlairType(linkFlairType: String) {
        this.linkFlairType = linkFlairType
    }

    fun getWls(): Int? {
        return wls
    }

    fun setWls(wls: Int?) {
        this.wls = wls
    }

    fun getBannedBy(): Any? {
        return bannedBy
    }

    fun setBannedBy(bannedBy: Any) {
        this.bannedBy = bannedBy
    }

    fun getAuthorFlairType(): String? {
        return authorFlairType
    }

    fun setAuthorFlairType(authorFlairType: String) {
        this.authorFlairType = authorFlairType
    }

    fun getContestMode(): Boolean? {
        return contestMode
    }

    fun setContestMode(contestMode: Boolean?) {
        this.contestMode = contestMode
    }

    fun getSelftextHtml(): Any? {
        return selftextHtml
    }

    fun setSelftextHtml(selftextHtml: Any) {
        this.selftextHtml = selftextHtml
    }

    fun getLikes(): Any? {
        return likes
    }

    fun setLikes(likes: Any) {
        this.likes = likes
    }

    fun getSuggestedSort(): Any? {
        return suggestedSort
    }

    fun setSuggestedSort(suggestedSort: Any) {
        this.suggestedSort = suggestedSort
    }

    fun getBannedAtUtc(): Any? {
        return bannedAtUtc
    }

    fun setBannedAtUtc(bannedAtUtc: Any) {
        this.bannedAtUtc = bannedAtUtc
    }

    fun getViewCount(): Any? {
        return viewCount
    }

    fun setViewCount(viewCount: Any) {
        this.viewCount = viewCount
    }

    fun getArchived(): Boolean? {
        return archived
    }

    fun setArchived(archived: Boolean?) {
        this.archived = archived
    }

    fun getNoFollow(): Boolean? {
        return noFollow
    }

    fun setNoFollow(noFollow: Boolean?) {
        this.noFollow = noFollow
    }

    fun getIsCrosspostable(): Boolean? {
        return isCrosspostable
    }

    fun setIsCrosspostable(isCrosspostable: Boolean?) {
        this.isCrosspostable = isCrosspostable
    }

    fun getPinned(): Boolean? {
        return pinned
    }

    fun setPinned(pinned: Boolean?) {
        this.pinned = pinned
    }

    fun getOver18(): Boolean? {
        return over18
    }

    fun setOver18(over18: Boolean?) {
        this.over18 = over18
    }

    fun getPreview(): Preview? {
        return preview
    }

    fun setPreview(preview: Preview) {
        this.preview = preview
    }

    fun getMediaOnly(): Boolean? {
        return mediaOnly
    }

    fun setMediaOnly(mediaOnly: Boolean?) {
        this.mediaOnly = mediaOnly
    }

    fun getLinkFlairTemplateId(): Any? {
        return linkFlairTemplateId
    }

    fun setLinkFlairTemplateId(linkFlairTemplateId: Any) {
        this.linkFlairTemplateId = linkFlairTemplateId
    }

    fun getCanGild(): Boolean? {
        return canGild
    }

    fun setCanGild(canGild: Boolean?) {
        this.canGild = canGild
    }

    fun getSpoiler(): Boolean? {
        return spoiler
    }

    fun setSpoiler(spoiler: Boolean?) {
        this.spoiler = spoiler
    }

    fun getLocked(): Boolean? {
        return locked
    }

    fun setLocked(locked: Boolean?) {
        this.locked = locked
    }

    fun getAuthorFlairText(): Any? {
        return authorFlairText
    }

    fun setAuthorFlairText(authorFlairText: Any) {
        this.authorFlairText = authorFlairText
    }

    fun getVisited(): Boolean? {
        return visited
    }

    fun setVisited(visited: Boolean?) {
        this.visited = visited
    }

    fun getNumReports(): Any? {
        return numReports
    }

    fun setNumReports(numReports: Any) {
        this.numReports = numReports
    }

    fun getDistinguished(): Any? {
        return distinguished
    }

    fun setDistinguished(distinguished: Any) {
        this.distinguished = distinguished
    }

    fun getSubredditId(): String? {
        return subredditId
    }

    fun setSubredditId(subredditId: String) {
        this.subredditId = subredditId
    }

    fun getModReasonBy(): Any? {
        return modReasonBy
    }

    fun setModReasonBy(modReasonBy: Any) {
        this.modReasonBy = modReasonBy
    }

    fun getRemovalReason(): Any? {
        return removalReason
    }

    fun setRemovalReason(removalReason: Any) {
        this.removalReason = removalReason
    }

    fun getLinkFlairBackgroundColor(): String? {
        return linkFlairBackgroundColor
    }

    fun setLinkFlairBackgroundColor(linkFlairBackgroundColor: String) {
        this.linkFlairBackgroundColor = linkFlairBackgroundColor
    }

    fun getId(): String? {
        return id
    }

    fun setId(id: String) {
        this.id = id
    }

    fun getReportReasons(): Any? {
        return reportReasons
    }

    fun setReportReasons(reportReasons: Any) {
        this.reportReasons = reportReasons
    }

    fun getAuthor(): String? {
        return author
    }

    fun setAuthor(author: String) {
        this.author = author
    }

    fun getNumCrossposts(): Int? {
        return numCrossposts
    }

    fun setNumCrossposts(numCrossposts: Int?) {
        this.numCrossposts = numCrossposts
    }

    fun getNumComments(): Int? {
        return numComments
    }

    fun setNumComments(numComments: Int?) {
        this.numComments = numComments
    }

    fun getSendReplies(): Boolean? {
        return sendReplies
    }

    fun setSendReplies(sendReplies: Boolean?) {
        this.sendReplies = sendReplies
    }

    fun getModReports(): List<Any>? {
        return modReports
    }

    fun setModReports(modReports: List<Any>) {
        this.modReports = modReports
    }

    fun getAuthorFlairTextColor(): Any? {
        return authorFlairTextColor
    }

    fun setAuthorFlairTextColor(authorFlairTextColor: Any) {
        this.authorFlairTextColor = authorFlairTextColor
    }

    fun getPermalink(): String? {
        return permalink
    }

    fun setPermalink(permalink: String) {
        this.permalink = permalink
    }

    fun getWhitelistStatus(): String? {
        return whitelistStatus
    }

    fun setWhitelistStatus(whitelistStatus: String) {
        this.whitelistStatus = whitelistStatus
    }

    fun getStickied(): Boolean? {
        return stickied
    }

    fun setStickied(stickied: Boolean?) {
        this.stickied = stickied
    }

    fun getUrl(): String? {
        return url
    }

    fun setUrl(url: String) {
        this.url = url
    }

    fun getSubredditSubscribers(): Int? {
        return subredditSubscribers
    }

    fun setSubredditSubscribers(subredditSubscribers: Int?) {
        this.subredditSubscribers = subredditSubscribers
    }

    fun getCreatedUtc(): Int? {
        return createdUtc
    }

    fun setCreatedUtc(createdUtc: Int?) {
        this.createdUtc = createdUtc
    }

    fun getMedia(): Any? {
        return media
    }

    fun setMedia(media: Any) {
        this.media = media
    }

    fun getIsVideo(): Boolean? {
        return isVideo
    }

    fun setIsVideo(isVideo: Boolean?) {
        this.isVideo = isVideo
    }


}