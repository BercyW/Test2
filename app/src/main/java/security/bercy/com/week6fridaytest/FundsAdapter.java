package security.bercy.com.week6fridaytest;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import security.bercy.com.week6fridaytest.Model.funds;

/**
 * Created by Bercy on 1/12/18.
 */

public class FundsAdapter extends RecyclerView.Adapter<FundsAdapter.ViewHolder> {

    List<funds> fundsList;

    public FundsAdapter(List<funds> fundsList) {
        this.fundsList = fundsList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        View fundView;
        TextView tv_id;
        TextView tv_investmentName;
        TextView tv_agency;

        public ViewHolder(View itemView) {
            super(itemView);
            fundView = itemView;
            tv_id = itemView.findViewById(R.id.tv_id);
            tv_investmentName = itemView.findViewById(R.id.tv_investmentName);
            tv_agency = itemView.findViewById(R.id.tv_agency);

        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_funds,parent,false);
        final ViewHolder viewHolder = new ViewHolder(view);
        viewHolder.fundView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = viewHolder.getAdapterPosition();
                funds funds = fundsList.get(position);

            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        funds funds = fundsList.get(position);
        holder.tv_id.setText(funds.getId()+"");
        holder.tv_investmentName.setText(funds.getInvestmentName());
        holder.tv_agency.setText(funds.getAgency());
    }

    @Override
    public int getItemCount() {
        return fundsList.size();
    }


}
