/*==============================================================================
            Copyright (c) 2012 QUALCOMM Austria Research Center GmbH.
            All Rights Reserved.
            Qualcomm Confidential and Proprietary
==============================================================================*/
package com.teamthrust.MTGRecognition.model;

import android.graphics.Bitmap;

/** A support class encapsulating the info for one card*/
public class Card
{
    private String title;
    private String set;
    private String targetId;
    private Bitmap thumb;
    private String cardUrl;
    private String lowPrice;
    private String avgPrice;
    private String highPrice;


    public Card()
    {

    }

    public String getLowPrice()
    {
        return lowPrice;
    }
    
    public String getAvgPrice()
    {
        return avgPrice;
    }
    
    public String getHighPrice()
    {
        return highPrice;
    }
    
    public void setLowPrice(String lowPrice)
    {
        this.lowPrice = lowPrice;
    }
    
    public void setAvgPrice(String avgPrice)
    {
        this.avgPrice = avgPrice;
    }
    
    public void setHighPrice(String highPrice)
    {
        this.highPrice = highPrice;
    }
    
    
    public String getTitle()
    {
        return title;
    }


    public void setTitle(String title)
    {
        this.title = title;
    }


    public String getSet()
    {
        return set;
    }


    public void setSet(String set)
    {
        this.set = set;
    }

    public String getTargetId()
    {
        return targetId;
    }


    public void setTargetId(String targetId)
    {
        this.targetId = targetId;
    }


    public Bitmap getThumb()
    {
        return thumb;
    }


    public void setThumb(Bitmap thumb)
    {
        this.thumb = thumb;
    }


    public String getCardUrl()
    {
        return cardUrl;
    }


    public void setCardUrl(String cardUrl)
    {
        this.cardUrl = cardUrl;
    }


    public void recycle()
    {
        // Cleans the Thumb bitmap variable
        thumb.recycle();
        thumb = null;
    }
}
