## VerticalViewPager
[![license](https://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat)](https://github.com/guochong/VerticalViewPager-chad/blob/master/LICENSE)
[![default](https://img.shields.io/badge/Platform-Android-brightgreen.svg)](https://github.com/guochong/VerticalViewPager-chad/wiki)

A vertical scrollable ViewPager implementation.Works well with RecyclerView and ListView, currently not support TextView or ImageView as child directly, but you can put everything into RecyclerView and ListView.

In the latest work, we need a vertical scrollable ViewPager, and Android ViewPager only support horizontal scroll, there are already some work such as [kaelaela/VerticalViewPager](https://github.com/kaelaela/VerticalViewPager) and [DragScrollDetailsLayout](https://github.com/happylishang/DragScrollDetailsLayout), but they are not meet our conditions. So I figure out an implementation and build this project.

We use this on WeChat Canvas Ads.

## Screenshots
![default](screenshots/demo1.gif) ![default](screenshots/demo2.gif) 

## How does it work?


Use ViewPager's fake drag feature and View.OnTouchListener to manage the touch event. 

Implementation:

  * DummyViewPager override the onInterceptTouchEvent method and return false, dispatch touch events to it's children;
  * Set VerticalVPOnTouchListener as the View.OnTouchListener of the child view (RecyclyerView\ListVeiw...), VerticalVPOnTouchListener manages the child view's scroll and fake the ViewPager's scroll;
  * Read the source code.
  
I build my project based on [kaelaela/VerticalViewPager](https://github.com/kaelaela/VerticalViewPager), but we use completely different implementations.

## Next:

- [ ] Support TextView/ImageView as child directly;
- [ ] Add more examples;

## Me

Chad Guo

* guochongscut@gmail.com

License
-------
Please [LICENSE](https://github.com/guochong/VerticalViewPager-chad/blob/master/LICENSE).

Please let me know if you use this project, tks.
