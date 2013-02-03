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
    public void setCardSet(String cardSet)
    {
        TextView tv = (TextView) findViewById(R.id.custom_view_set);
        tv.setText(cardSet);
    }


    /** Sets Card Price in View */
    public void setCardLowPrice(String cardLowPrice)
    {
        TextView tv = (TextView) findViewById(R.id.custom_view_price_low);
        tv.setText(getContext().getString(R.string.lowPrice) + " " + cardLowPrice);
    }
    
    public void setCardAvgPrice(String cardAvgPrice)
    {
        TextView tv = (TextView) findViewById(R.id.custom_view_price_avg);
        tv.setText(getContext().getString(R.string.avgPrice) + " " + cardAvgPrice);
    }
    
    public void setCardHighPrice(String cardHighPrice)
    {
        TextView tv = (TextView) findViewById(R.id.custom_view_price_high);
        tv.setText(getContext().getString(R.string.highPrice) + " " + cardHighPrice);
    }

    /** Sets Card Cover in View from a bitmap */
    public void setCoverViewFromBitmap(Bitmap coverCard)
    {
        ImageView iv = (ImageView) findViewById(R.id.custom_view_card_cover);
        iv.setImageBitmap(coverCard);
    }
}
