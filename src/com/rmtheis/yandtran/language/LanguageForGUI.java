package com.rmtheis.yandtran.language;

/**
 * Created by l1fe on 13.06.2015.
 */
public enum LanguageForGUI {
    sq("ALBANIAN"),
    hy("ARMENIAN"),
    az("AZERBAIJANI"),
    be("BELARUSIAN"),
    bg("BULGARIAN"),
    ca("CATALAN"),
    hr("CROATIAN"),
    cs("CZECH"),
    da("DANISH"),
    nl("DUTCH"),
    en("ENGLISH"),
    et("ESTONIAN"),
    fi("FINNISH"),
    fr("FRENCH"),
    de("GERMAN"),
    ka("GEORGIAN"),
    el("GREEK"),
    hu("HUNGARIAN"),
    it("ITALIAN"),
    lv("LATVIAN"),
    lt("LITHUANIAN"),
    mk("MACEDONIAN"),
    no("NORWEGIAN"),
    pl("POLISH"),
    pt("PORTUGUESE"),
    ro("ROMANIAN"),
    ru("RUSSIAN"),
    sr("SERBIAN"),
    sk("SLOVAK"),
    sl("SLOVENIAN"),
    es("SPANISH"),
    sv("SWEDISH"),
    tr("TURKISH"),
    uk("UKRAINIAN");
    private final String languageForGUI;

    /**
     * Enum constructor.
     * @param pLanguage The language identifier.
     */
    private LanguageForGUI(final String pLanguage) {
        languageForGUI = pLanguage;
    }

    public static LanguageForGUI fromString(final String pLanguage) {
        for (LanguageForGUI l : values()) {
            if (l.toString().equals(pLanguage)) {
                return l;
            }
        }
        return null;
    }

    /**
     * Returns the String representation of this language.
     * @return The String representation of this language.
     */
    @Override
    public String toString() {
        return languageForGUI;
    }

}
