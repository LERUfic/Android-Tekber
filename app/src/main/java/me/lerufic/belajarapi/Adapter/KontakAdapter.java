package me.lerufic.belajarapi.Adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import me.lerufic.belajarapi.EditActivity;
import me.lerufic.belajarapi.Model.Kontak;
import me.lerufic.belajarapi.R;

public class KontakAdapter extends RecyclerView.Adapter<KontakAdapter.MyViewHolder>{
    List<Kontak> mKontakList;

    public KontakAdapter(List <Kontak> KontakList) {
        mKontakList = KontakList;
    }

    @Override
    public MyViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.kontak_list, parent, false);
        MyViewHolder mViewHolder = new MyViewHolder(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder (MyViewHolder holder,final int position){
        holder.mTextViewId.setText(mKontakList.get(position).getId());
        holder.mTextViewNegara.setText(mKontakList.get(position).getNegara());
        holder.mTextViewEmas.setText(mKontakList.get(position).getEmas());
        holder.mTextViewPerak.setText(mKontakList.get(position).getPerak());
        holder.mTextViewPerunggu.setText(mKontakList.get(position).getPerunggu());
        holder.mTextViewTotal.setText(mKontakList.get(position).getTotal());
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent mIntent = new Intent(view.getContext(), EditActivity.class);
//                mIntent.putExtra("Id", mKontakList.get(position).getId());
//                mIntent.putExtra("Nama", mKontakList.get(position).getNama());
//                mIntent.putExtra("Nomor", mKontakList.get(position).getNomor());
//                view.getContext().startActivity(mIntent);
//            }
//        });
    }

    @Override
    public int getItemCount () {
        return mKontakList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextViewId, mTextViewNegara, mTextViewEmas, mTextViewPerak, mTextViewPerunggu, mTextViewTotal;

        public MyViewHolder(View itemView) {
            super(itemView);
            mTextViewId = (TextView) itemView.findViewById(R.id.textView);
            mTextViewNegara = (TextView) itemView.findViewById(R.id.textView2);
            mTextViewEmas = (TextView) itemView.findViewById(R.id.textView4);
            mTextViewPerak = (TextView) itemView.findViewById(R.id.textView5);
            mTextViewPerunggu = (TextView) itemView.findViewById(R.id.textView6);
            mTextViewTotal = (TextView) itemView.findViewById(R.id.textView7);
        }
    }
}
