package id.ac.astra.polman.screambox_0320180002;

import androidx.databinding.Bindable;

public class SoundViewModel {
    private Sound mSound;
    private ScreamBox mScreamBox;

    public SoundViewModel(ScreamBox screamBox) {
        mScreamBox = screamBox;
    }

    public String getTitle() {
        return mSound.getName();
    }

    public Sound getSound() {
        return mSound;
    }

    public void setSound(Sound sound) {
        mSound = sound;
    }
}
