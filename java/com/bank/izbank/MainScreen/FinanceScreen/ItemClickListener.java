package com.bank.rubani-bank.MainScreen.FinanceScreen;

import androidx.recyclerview.widget.RecyclerView;

public interface ItemClickListener {
    void onItemClicked(RecyclerView.ViewHolder vh, CryptoModel item, int pos);
}
