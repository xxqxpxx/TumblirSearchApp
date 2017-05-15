package com.example.ahmed.tumblrsearchapi.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ahmed.tumblrsearchapi.R;
import com.example.ahmed.tumblrsearchapi.model.Photo;
import com.example.ahmed.tumblrsearchapi.presenter.PhotoAdapter;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PhotoAdapter adapter;
    private List<Photo> photos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        Intent in = getIntent();
        String tv1 = in.getStringExtra("searchEntry");
      /*//  View.setText(tv1);
        Toast.makeText(SearchActivity.this , tv1 , Toast.LENGTH_LONG).show();*/

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        photos = new ArrayList<>();
        adapter = new PhotoAdapter(this, photos);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
       /* recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());*/
        recyclerView.setAdapter(adapter);

        prepareAlbums();

    /*    try {
           Picasso.with(this).load(R.drawable.cover).into((ImageView) findViewById(R.id.photoUrl));
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }

        private void prepareAlbums() {

            Photo a = new Photo("http://68.media.tumblr.com/7839d4b473084363b4044782f4e218d6/tumblr_oq01hzswfz1rrbdkco1_500.jpg");
            photos.add(a);

            a = new Photo("https://68.media.tumblr.com/575a7f7993d33789b709035f3118a4f2/tumblr_oq01mcdpvQ1ups5ppo1_1280.jpg");
            photos.add(a);

            a = new Photo("https://68.media.tumblr.com/cd2e108a770e149f335f9576de0dbd23/tumblr_oq01h8iLfR1tvmjyyo1_1280.jpg");
            photos.add(a);

            a = new Photo("http://68.media.tumblr.com/2a13174cec006895e92370a3cf2abcfe/tumblr_oq01g5ntFM1uwyu6ro1_1280.jpg");
            photos.add(a);

            a = new Photo("https://68.media.tumblr.com/249e9b0b6312b08488db4ed6d5246569/tumblr_oq01glwhit1uh54woo1_75sq.jpg");
            photos.add(a);

            a = new Photo("https://68.media.tumblr.com/e61424787fa22d7b6bc686b544647d16/tumblr_ooghilE3TU1tthcowo1_1280.jpg");
            photos.add(a);


            adapter.notifyDataSetChanged();
        }

      /*  public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

            private int spanCount;
            private int spacing;
            private boolean includeEdge;


            public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
                this.spanCount = spanCount;
                this.spacing = spacing;
                this.includeEdge = includeEdge;
            }

            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                int position = parent.getChildAdapterPosition(view); // item position
                int column = position % spanCount; // item column

                if (includeEdge) {
                    outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                    outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                    if (position < spanCount) { // top edge
                        outRect.top = spacing;
                    }
                    outRect.bottom = spacing; // item bottom
                } else {
                    outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                    outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                    if (position >= spanCount) {
                        outRect.top = spacing; // item top
                    }
                }
            }
        }

        *//**
         * Converting dp to pixel
         *//*
        private int dpToPx(int dp) {
            Resources r = getResources();
            return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
        }*/
    }


