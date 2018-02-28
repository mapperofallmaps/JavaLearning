package com.Dlau;

/**
 * Created by Daniel on 6/09/2017.
 */
public class Button {
    private String title;
    private OnClickListener onClickLister;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickLister) {
        this.onClickLister = onClickLister;
    }

    public void onClick() {
        this.onClickLister.onClick(this.title);
    }

    public interface OnClickListener {
        public void onClick(String title);
    }
}
