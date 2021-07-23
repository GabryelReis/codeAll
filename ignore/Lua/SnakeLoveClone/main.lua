--Snake Game by Gabryel Reis. This game use the GPL Licence.

function love.load()
  snake = {}
  fruits = {}
  
  newHead = #snake -- +1
  
  snake.x = 10
  snake.y = 10
end

function love.update(dt)
  
end

function love.draw()
    love.graphics.rectangle("fill", snake.x, snake.y, 20, 20)
end

function love.keypressed(key)

end