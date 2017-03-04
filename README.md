## VerticalViewPager-chad
[![license](https://img.shields.io/badge/license-MIT-brightgreen.svg?style=flat)](https://github.com/guochong/VerticalViewPager-chad/blob/master/LICENSE)
[![default](https://img.shields.io/badge/Platform-Android-brightgreen.svg)](https://github.com/guochong/VerticalViewPager-chad/wiki)

An vertically scrollable ViewPager implementation.

## Screenshots
![default](screenshots/demo1.gif) ![default](screenshots/demo2.gif) 

## How does it work?

Use ViewPager's fake drag feature and View.OnTouchListener to manage the touch event. Works well with RecyclerView and ListView, though i havn't test it with other View, but i believe it will work too. Feel free to use it with other View.

Implementation:
  * DummyViewPager override the onInterceptTouchEvent method and return false, dispatch touch events to it's children;
  * Set VerticalVPOnTouchListener as the View.OnTouchListener of the child view (RecyclyerView\ListVeiw...), VerticalVPOnTouchListener managers the child view's scroll and fake the ViewPager's scroll;
  * Read the source code.
I build my project base on [kaelaela/VerticalViewPager](https://github.com/kaelaela/VerticalViewPager), but we use completely different implementations.

## Next:

- [ ] Add more examples;
- [ ] Better ReadMe;

## Me

Chad Guo
* guochongscut@gmail.com

License
-------
Please [LICENSE](https://github.com/guochong/VerticalViewPager-chad/blob/master/LICENSE)。
