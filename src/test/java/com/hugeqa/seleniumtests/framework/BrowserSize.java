package com.hugeqa.seleniumtests.framework;

import org.openqa.selenium.Dimension;

/**
 * User: rlaplaca
 * Date: 11/14/13
 * Time: 10:44 AM
 */
public enum BrowserSize {

    /**
     * The MOBILE.
     */MOBILE(400, 640), /**
     * The TABLET.
     */TABLET(959, 1200), /**
     * The WEB.
     */WEB(1204, 1024), /**
     * The PHANTOM.
     */PHANTOM(1280, 1024);

    /**
     * The Browser width.
     */
    private final Integer browserWidth;
    /**
     * The Browser height.
     */
    private final Integer browserHeight;

    /**
     * Instantiates a new Browser size.
     *
     * @param browserWidth  the browser width
     * @param browserHeight the browser height
     */
    private BrowserSize(Integer browserWidth, Integer browserHeight) {
        this.browserWidth = browserWidth;
        this.browserHeight = browserHeight;
    }

    /**
     * Gets dimension.
     *
     * @return the dimension
     */
    public Dimension getDimension() {
        return new Dimension(browserWidth, browserHeight);
    }


}