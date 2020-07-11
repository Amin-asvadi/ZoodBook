package com.example.zoodbook.ui.tabfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.zoodbook.R;
import com.example.zoodbook.ui.ViewModel.BookUserCommentModel;
import com.example.zoodbook.ui.adapters.BookCommentsAdapter;
import com.example.zoodbook.ui.adapters.FreeBookLibralysAdapter;
import com.example.zoodbook.ui.mdoels.FreeBookLibralysModel;
import com.example.zoodbook.ui.utility.Global;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CommentFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CommentFragment extends Fragment {
	BookCommentsAdapter bookCommentsAdapter;
	List<BookUserCommentModel> bookUserCommentitems;
	// TODO: Rename parameter arguments, choose names that match
	// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
	private static final String ARG_PARAM1 = "param1";
	private static final String ARG_PARAM2 = "param2";

	// TODO: Rename and change types of parameters
	private String mParam1;
	private String mParam2;

	public CommentFragment() {
		// Required empty public constructor
	}

	/**
	 * Use this factory method to create a new instance of
	 * this fragment using the provided parameters.
	 *
	 * @param param1 Parameter 1.
	 * @param param2 Parameter 2.
	 * @return A new instance of fragment CommentFragment.
	 */
	// TODO: Rename and change types and number of parameters
	public static CommentFragment newInstance(String param1, String param2) {
		CommentFragment fragment = new CommentFragment();
		Bundle args = new Bundle();
		args.putString(ARG_PARAM1, param1);
		args.putString(ARG_PARAM2, param2);
		fragment.setArguments(args);
		return fragment;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (getArguments() != null) {
			mParam1 = getArguments().getString(ARG_PARAM1);
			mParam2 = getArguments().getString(ARG_PARAM2);
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                         Bundle savedInstanceState) {
		View root =	inflater.inflate(R.layout.fragment_comment, container, false);

		RecyclerView rc_comment = root.findViewById(R.id.rc_comments);
		bookUserCommentitems = new ArrayList<>();
		bookUserCommentitems.add(new BookUserCommentModel
				(R.drawable.profile_img,4.8f,
						"23/3/99","حسین عباسی زاده","خیلی داستان بامزه و جالبی بود که بخشی از زندگی کودکی خودمون رو بیان می کرد ، علاوه بر این گوینده عالی و موزیک فوق العاده بود "));
		bookUserCommentitems.add(new BookUserCommentModel
				(R.drawable.profile_img,4.8f,
						"23/3/99","حسین عباسی زاده","خیلی داستان بامزه و جالبی بود که بخشی از زندگی کودکی خودمون رو بیان می کرد ، علاوه بر این گوینده عالی و موزیک فوق العاده بود "));
		bookUserCommentitems.add(new BookUserCommentModel
				(R.drawable.profile_img,4.8f,
						"23/3/99","حسین عباسی زاده","خیلی داستان بامزه و جالبی بود که بخشی از زندگی کودکی خودمون رو بیان می کرد ، علاوه بر این گوینده عالی و موزیک فوق العاده بود "));
		bookUserCommentitems.add(new BookUserCommentModel
				(R.drawable.profile_img,4.8f,
						"23/3/99","حسین عباسی زاده","خیلی داستان بامزه و جالبی بود که بخشی از زندگی کودکی خودمون رو بیان می کرد ، علاوه بر این گوینده عالی و موزیک فوق العاده بود "));
		bookUserCommentitems.add(new BookUserCommentModel
				(R.drawable.profile_img,4.8f,
						"23/3/99","حسین عباسی زاده","خیلی داستان بامزه و جالبی بود که بخشی از زندگی کودکی خودمون رو بیان می کرد ، علاوه بر این گوینده عالی و موزیک فوق العاده بود "));
		bookUserCommentitems.add(new BookUserCommentModel
				(R.drawable.profile_img,4.8f,
						"23/3/99","حسین عباسی زاده","خیلی داستان بامزه و جالبی بود که بخشی از زندگی کودکی خودمون رو بیان می کرد ، علاوه بر این گوینده عالی و موزیک فوق العاده بود "));
		bookUserCommentitems.add(new BookUserCommentModel
				(R.drawable.profile_img,4.8f,
						"23/3/99","حسین عباسی زاده","خیلی داستان بامزه و جالبی بود که بخشی از زندگی کودکی خودمون رو بیان می کرد ، علاوه بر این گوینده عالی و موزیک فوق العاده بود "));
		bookUserCommentitems.add(new BookUserCommentModel
				(R.drawable.profile_img,4.8f,
						"23/3/99","حسین عباسی زاده","خیلی داستان بامزه و جالبی بود که بخشی از زندگی کودکی خودمون رو بیان می کرد ، علاوه بر این گوینده عالی و موزیک فوق العاده بود "));
		bookUserCommentitems.add(new BookUserCommentModel
				(R.drawable.profile_img,4.8f,
						"23/3/99","حسین عباسی زاده","خیلی داستان بامزه و جالبی بود که بخشی از زندگی کودکی خودمون رو بیان می کرد ، علاوه بر این گوینده عالی و موزیک فوق العاده بود "));
		bookUserCommentitems.add(new BookUserCommentModel
				(R.drawable.profile_img,4.8f,
						"23/3/99","حسین عباسی زاده","خیلی داستان بامزه و جالبی بود که بخشی از زندگی کودکی خودمون رو بیان می کرد ، علاوه بر این گوینده عالی و موزیک فوق العاده بود "));

		bookCommentsAdapter = new BookCommentsAdapter(bookUserCommentitems, getContext());

		LinearLayoutManager linearLayoutManager = new LinearLayoutManager
				(getContext(), LinearLayoutManager.VERTICAL, false);

		rc_comment.setLayoutManager(linearLayoutManager);

		rc_comment.setAdapter(bookCommentsAdapter);
		return root;

	}
}