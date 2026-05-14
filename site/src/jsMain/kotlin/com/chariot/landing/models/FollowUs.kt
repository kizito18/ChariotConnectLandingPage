package com.chariot.landing.models

import com.chariot.landing.util.ConstantsObject


enum class FollowUs(
    val title: String,
    val link: String
) {
    Instagram(
        title = "Instagram",
        link = ConstantsObject.INSTAGRAM_WEB_LINK
    ),
    Tiktok(
        title = "Tiktok",
        link = ConstantsObject.TIKTOK
    ),
    Twitter(
        title = "X (Twitter)",
        link = ConstantsObject.X_WEB_LINK
    ),

    Linkedin(
        title = "Linkedin",
        link = ConstantsObject.LINKEDIN_WEB_LINK
    )
}