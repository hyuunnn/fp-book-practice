defmodule MyList do

  def max([one]) do
    one
  end

  def max([head|tail]) do
    max_tail = max(tail)
    if head > max_tail do
      head
    else
      max_tail
    end
  end

  def odd([one]) do
    one
  end

  def odd([head|tail]) do
    if rem(head, 2) != 0 do
      [head | odd(tail)]
    else
      odd(tail)
    end
  end

end