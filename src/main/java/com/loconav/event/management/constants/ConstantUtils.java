package com.loconav.event.management.constants;

public final class ConstantUtils {

    /**
     * The constant PAGE_DEFAULT_VALUE.
     */
    public static final String PAGE_DEFAULT_VALUE = "0";
    /**
     * The constant PER_PAGE_DEFAULT_VALUE.
     */
    public static final String PER_PAGE_DEFAULT_VALUE = "10";
    /**
     * The constant EMAIL_REGEX.
     */
    public static final String EMAIL_REGEX = ".+@.+\\.[a-zA-Z]+";

    /**
     * The constant DOMAIN_REGEX.
     */
    public static final String DOMAIN_REGEX = "^[a-zA-Z0-9][a-zA-Z0-9-.]{1,61}[a-zA-Z0-9]\\.[a-zA-Z]{2,}$";

    /**
     * The constant FILE_EXTENSION_REGEX.
     */
    public static final String FILE_EXTENSION_REGEX = "[-_. A-Za-z0-9]+\\.(png|jpeg|svg|jpg)";

    /**
     * The constant COLOR_CODE_REGEX.
     */
    public static final String COLOR_CODE_REGEX = "^#(?:[0-9a-fA-F]{3}){1,2}$";

    /**
     * The constant LOCONAV_APP_STORE_LINK.
     */
    public static final String LOCONAV_APP_STORE_LINK = "https://play.google.com/store/apps/details?id=com.loconav&hl=en";

    /**
     * The constant PLATFORM_BUILD_PATH.
     */
    public static final String PLATFORM_BUILD_PATH = "https://play.google.com/store/apps/details?hl=en&id=%s";

    /**
     * The constant NO_STABLE_BUILD_PRESENT_STRING.
     */
    public static final String NO_STABLE_BUILD_PRESENT_STRING = "No stable build present";

    /**
     * The constant UUID_REGEX.
     */
    public static final String UUID_REGEX = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$";


    /**
     * The constant EMPTY_STRING_REGEX.
     */
    public static final String EMPTY_STRING_REGEX = "^$";


    /**
     * The constant REQUEST_ID.
     */
    public static final String REQUEST_ID = "requestId";
    /**
     * The constant REQUEST_TRACE_ID.
     */
    public static final String REQUEST_TRACE_ID = "X-REQUEST-TRACE-ID";

    /**
     * The constant PRIMARY_PHONE_TYPE.
     */
    public static final String PRIMARY_PHONE_TYPE = "PrimaryPhone";

    /**
     * The constant SUPPORT_PHONE_TYPE.
     */
    public static final String SUPPORT_PHONE_TYPE = "SupportPhone";

    /**
     * Instantiates a new Constant utils.
     */
    private ConstantUtils() {
        throw new IllegalStateException("Constants class");
    }
}

