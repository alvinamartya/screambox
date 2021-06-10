package id.ac.astra.polman.screambox_0320180002;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.ac.astra.polman.screambox_0320180002.databinding.ListItemSoundBinding;

public class SoundAdapter extends RecyclerView.Adapter<SoundHolder> {
    private final Context mContext;
    private final List<Sound> mSoundList;
    private final ScreamBox mScreamBox;

    public SoundAdapter(Context context, List<Sound> soundList, ScreamBox screamBox) {
        mContext = context;
        mSoundList = soundList;
        mScreamBox = screamBox;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public SoundHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ListItemSoundBinding binding = DataBindingUtil
                .inflate(inflater, R.layout.list_item_sound, parent,false);

        return new SoundHolder(binding, mScreamBox);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull SoundHolder holder, int position) {
        Sound sound = mSoundList.get(position);
        holder.bind(sound);
    }

    @Override
    public int getItemCount() {
        return mSoundList.size();
    }
}
