/*==============================================================================
            Copyright (c) 2012 QUALCOMM Austria Research Center GmbH.
            All Rights Reserved.
            Qualcomm Confidential and Proprietary

@file
    CardOverlayView.java

@brief
    Custom View to display the card overlay data

==============================================================================*/
package com.teamthrust.MTGRecognition.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.teamthrust.MTGRecognition.R;

/** Custom View with Card Overlay Data */
public class CardOverlayView extends RelativeLayout
{
    public CardOverlayView(Context context)
    {
        this(context, null);
    }


    public CardOverlayView(Context context, AttributeSet attrs)
    {
        this(context, attrs, 0);
    }


    public CardOverlayView(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        inflateLayout(context);

    }


    /** Inflates the Custom View Layout */
    private void inflateLayout(Context context)
    {

        final LayoutInflater inflater = LayoutInflater.from(context);

        // Generates the layout for the view
        inflater.inflate(R.layout.bitmap_layout, this, true);
    }


    /** Sets Card title in View */
    public void setCardTitle(String cardTitle)
    {
        TextView tv = (TextView) findViewById(R.id.custom_view_title);
        tv.setText(cardTitle);
    }


    /** Sets Card Author in View */
    public void setCardAuthor(String cardAuthor)
    {
        TextView tv = (TextView) findViewById(R.id.custom_view_author);
        tv.setText(cardAuthor);
    }


    /** Sets Card Price in View */
    public void setCardPrice(String cardPrice)
    {
        TextView tv = (TextView) findViewById(R.id.custom_view_price_old);
        tv.setText(getContext().getString(R.string.string_$) + cardPrice);
    }


    /** Sets Card Number of Ratings in View */
    public void setCardRatingCount(String ratingCount)
    {
        TextView tv = (TextView) findViewById(R.id.custom_view_rating_text);
        tv.setText(getContext().getString(R.string.string_openParentheses)
                + ratingCount + getContext().getString(R.string.string_ratings)
                + getContext().getString(R.string.string_closeParentheses));
    }


    /** Sets Card Special Price in View */
    public void setYourPrice(String yourPrice)
    {
        TextView tv = (TextView) findViewById(R.id.badge_price_value);
        tv.setText(getContext().getString(R.string.string_$) + yourPrice);
    }


    /** Sets Card Cover in View from a bitmap */
    public void setCoverViewFromBitmap(Bitmap coverCard)
    {
        ImageView iv = (ImageView) findViewById(R.id.custom_view_card_cover);
        iv.setImageBitmap(coverCard);
    }


    /** Sets Card Rating in View */
    public void setRating(String rating)
    {
        RatingBar rb = (RatingBar) findViewById(R.id.custom_view_rating);
        rb.setRating(Float.parseFloat(rating));
    }
}
