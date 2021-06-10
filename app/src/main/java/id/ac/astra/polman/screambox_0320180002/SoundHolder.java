package id.ac.astra.polman.screambox_0320180002;

import androidx.recyclerview.widget.RecyclerView;
import id.ac.astra.polman.screambox_0320180002.databinding.ListItemSoundBinding;

public class SoundHolder extends RecyclerView.ViewHolder {
    private ListItemSoundBinding mBinding;

    public SoundHolder(ListItemSoundBinding binding, ScreamBox screamBox) {
        super(binding.getRoot());
        mBinding = binding;
        mBinding.setViewModel(new SoundViewModel(screamBox));
    }

    public void bind(Sound sound) {
        mBinding.getViewModel().setSound(sound);
        mBinding.executePendingBindings();
    }
}
