# VerticalViewPager-chad
An vertically scrollable ViewPager implementation

Use ViewPager's fake drag feature and View.OnTouchListener to manage the touch event. Works well with RecyclerView and ListView, though i havn't test it with other View, but i believe it will work too. Feel free to use it with other View.

Implementation:
  1. DummyViewPager override the onInterceptTouchEvent method and return false, dispatch touch events to it's children;
  2. Set VerticalVPOnTouchListener as the View.OnTouchListener of the child view (RecyclyerView\ListVeiw...), VerticalVPOnTouchListener managers the child view's scroll and fake the ViewPager's scroll;
  3. Read the source code.
  
I build my project base on kaelaela/VerticalViewPager(https://github.com/kaelaela/VerticalViewPager), but we use completely different implementations.

Next:
  1. Add more examples;
  2. Better ReadMe;
