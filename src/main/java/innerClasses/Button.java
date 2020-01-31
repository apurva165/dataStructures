package innerClasses;

public class Button {
    private String title;
    private OnClickLisner onClickLisner;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickLisner onClickListener) {
        this.onClickLisner = onClickListener;
    }

    public void onClick() {
        this.onClickLisner.onClick(this.title);
    }

    public interface OnClickLisner {
        public void onClick(String title);
    }
}
