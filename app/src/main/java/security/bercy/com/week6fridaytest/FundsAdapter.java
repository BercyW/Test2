package security.bercy.com.week6fridaytest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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

        private final TextView tv_id;
        private final TextView tv_investmentName;
        private final TextView tv_agency;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_id = itemView.findViewById(R.id.tv_id);
            tv_investmentName = itemView.findViewById(R.id.tv_investmentName);
            tv_agency = itemView.findViewById(R.id.tv_agency);

        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_funds,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        funds funds = fundsList.get(position);
        holder.tv_id.setText(funds.getId());
        holder.tv_investmentName.setText(funds.getInvestmentName());
        holder.tv_agency.setText(funds.getAgency());
    }

    @Override
    public int getItemCount() {
        return fundsList.size();
    }


}
