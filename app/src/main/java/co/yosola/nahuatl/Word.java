package co.yosola.nahuatl;

public class Word {

    private String mDefaultTranslation;

    private String mNahuatlTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String DefaultTranslation, String NahuatlTranslation){
        mDefaultTranslation = DefaultTranslation;
        mNahuatlTranslation = NahuatlTranslation;
    }

    public Word(String defaultTranslation, String nahuatlTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mNahuatlTranslation = nahuatlTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getNahuatlTranslation(){
        return mNahuatlTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
